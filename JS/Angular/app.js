// app.js
var app = angular.module('myApp', ['ngRoute']);
app.config(['$routeProvider', '$locationProvider',function($routeProvider,$locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider.when('/', {
        templateUrl: 'home.html',
        controller: 'HomeController'
    })
    .when('/about', {
        templateUrl: 'about.html',
        controller: 'AboutController'
    })
    .when('/contact', {
        templateUrl: 'contact.html',
        controller: 'ContactController'
    })
    .otherwise({
        redirectTo: '/'
    });
}]);
app.controller('HomeController', function($scope) {
    $scope.message = 'Welcome to the Home Page!';
});

app.controller('AboutController', function($scope) {
    $scope.message = 'Learn more About Us on this page.';
});

app.controller('ContactController', function($scope) {
    $scope.message = 'Contact Us here.';
});
