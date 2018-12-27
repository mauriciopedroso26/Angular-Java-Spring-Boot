appCliente.controller("ClienteController", function ($scope, $http) {

    $scope.success = false;

    $scope.clienteList = [];
    $scope.cliente = {};

    $scope.findAll = function () {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/clienteEndPoint'
        }).then(function (response) {
            $scope.clienteList = response.data;

        }, function (response) {
            console.log(response.data);
            console.log(response.status);
        });
    };

    $scope.save = function () {
        $http({
            method: 'POST',
            url: 'http://localhost:8080/clienteEndPoint',
            data: $scope.cliente
        }).then(function (response) {
            $scope.success = true;
            $scope.findAll();
            $scope.cliente = {};

        }, function (response) {
            console.log(response.data);
            console.log(response.status);
        });
    };

    $scope.validaTaxaJuros = function () {
        if ($scope.cliente.risco === "A") {
            $scope.cliente.taxaJuros = "Não se aplica";
        } else if ($scope.cliente.risco === "B") {
            $scope.cliente.taxaJuros = "10%";
        } else if ($scope.cliente.risco === "C") {
            $scope.cliente.taxaJuros = "20%";
        }
    };

    $scope.findAll();
});