from http.server import BaseHTTPRequestHandler, HTTPServer
import os
import shutil
import threading

class MyRequestHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        try:
            file_name = self.path.strip("/")
            # Write the received data to a file
            with open(file_name, 'rb') as file:
                content = file.read()
            ext = file_name.split(".")[1]
            # Send a success response
            self.send_response(200)
            self.send_header('Content-type', f"text/{ext}")
            self.end_headers()
            self.wfile.write(content)
        except:
            # If the file does not exist, send a custom 404 response
            self.send_response(404)
            self.send_header('Content-type', 'text/html')
            self.end_headers()
            self.wfile.write(b"<html><body><h1>File not found</h1><p>The requested file does not exist.</p></body></html>")
    def do_POST(self):
        # Get content type from request headers
        content_type = self.headers.get('Content-Type')

        # Get content length from request headers
        content_length = int(self.headers.get('Content-Length'))

        # Read the content of the POST request0
        post_data = self.rfile.read(content_length)
        # Determine the file extension based on content type
        if content_type == 'text/plain':
            file_extension = '.txt'
        elif content_type == 'application/xml':
            file_extension = '.xml'
        else:
            file_extension = '.dat'  # Default to .dat if content type is unknown

        # Generate a unique file name (you may want to modify this logic)
        file_name = self.path.strip("/")

        # Write the received data to a file
        with open(file_name, 'wb') as file:
            file.write(post_data)
            file.flush()
        # Send a success response
        self.send_response(200)
        self.send_header('Content-type', 'text/plain')
        self.end_headers()
        help(self.send_response())

def run(server_class=HTTPServer, handler_class=MyRequestHandler, port=8080):
    server_address = ('', port)
    httpd = server_class(server_address, handler_class)
    print(f'Starting server on port {port}...')
    httpd.serve_forever()

server_thread = threading.Thread(target=run)
server_thread.start()
