package app;

import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Set up the game board
            int width = 10;
            int height = 10;
            char[][] board = new char[height][width];

            // Snake starting position and initial direction
            int snakeLength = 3;
            int[] snakeX = new int[snakeLength];
            int[] snakeY = new int[snakeLength];
            for (int i = 0; i < snakeLength; i++) {
                snakeX[i] = width / 2 - i;
                snakeY[i] = height / 2;
            }

            // Fruit position
            int fruitX = (int) (Math.random() * width);
            int fruitY = (int) (Math.random() * height);

            // Game loop
            boolean gameOver = false;
            int dx = 1; // Change in x-coordinate per move (initially move to the right)
            int dy = 0; // Change in y-coordinate per move
            int score = 0;

            while (!gameOver) {
                // Update board
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {
                        if (x == snakeX[0] && y == snakeY[0]) {
                            board[y][x] = 'S'; // Head of the snake
                        } else if (x == fruitX && y == fruitY) {
                            board[y][x] = 'F'; // Fruit
                        } else if (contains(snakeX, snakeY, x, y)) {
                            board[y][x] = 's'; // Body of the snake
                        } else {
                            board[y][x] = '.'; // Empty space
                        }
                    }
                }

                // Display the board
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {
                        System.out.print(board[y][x] + " ");
                    }
                    System.out.println();
                }

                // Check if the snake eats the fruit
                if (snakeX[0] == fruitX && snakeY[0] == fruitY) {
                    snakeLength++;
                    score++;
                    fruitX = (int) (Math.random() * width);
                    fruitY = (int) (Math.random() * height);
                }

                // Move the snake
                for (int i = snakeLength - 1; i > 0; i--) {
                    snakeX[i] = snakeX[i - 1];
                    snakeY[i] = snakeY[i - 1];
                }
                snakeX[0] += dx;
                snakeY[0] += dy;

                // Check for collision with the boundaries
                if (snakeX[0] < 0 || snakeX[0] >= width || snakeY[0] < 0 || snakeY[0] >= height) {
                    gameOver = true;
                }

                // Check for collision with itself
                if (contains(snakeX, snakeY, snakeX[0], snakeY[0], 1, snakeLength)) {
                    gameOver = true;
                }

                // Wait for a short time before the next move
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Get user input to change direction
                String input = scanner.nextLine();
                switch (input.toLowerCase()) {
                    case "w":
                        dx = 0;
                        dy = -1;
                        break;
                    case "a":
                        dx = -1;
                        dy = 0;
                        break;
                    case "s":
                        dx = 0;
                        dy = 1;
                        break;
                    case "d":
                        dx = 1;
                        dy = 0;
                        break;
                }
            }

            System.out.println("Game Over! Your score: " + score);
        }
    }

    private static boolean contains(int[] arrX, int[] arrY, int x, int y) {
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] == x && arrY[i] == y) {
                return true;
            }
        }
        return false;
    }

    private static boolean contains(int[] arrX, int[] arrY, int x, int y, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            if (arrX[i] == x && arrY[i] == y) {
                return true;
            }
        }
        return false;
    }
}
