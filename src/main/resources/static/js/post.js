var app=angular.module("mypost",['ngRoute']);

 app.controller("mypostController", function($scope, $http) {
	 $scope.compte=null;
	 $scope.codeCompte=null;
	 $scope.pageOperation=[];
	 $scope.errorMessage=null;
	 $scope.operation={type:"versement",montant:0,cpt2:null};
	 $scope.pagecourante=0;
	 $scope.pagesize=5;
	 $scope.pages=[];
	 $scope.chargercompte=function(){
		 $scope.pagecourante=0;
		 $http.get("/comptes/"+$scope.codeCompte)
		 .success(function(data){
			 $scope.compte=data;
			 $scope.chargeroperation();
			 
	 })
	 .error(function(data){
		 $scope.errorMessage=data.message;
	
	 });
	 
	 };
	 
	 
 $scope.chargeroperation=function(){
		 $scope.errorMessage=null;
		 $http.get("/operations?codeCompte="+$scope.codeCompte+"&page="+$scope.pagecourante+"&size="+$scope.pagesize)
		 .success(function(data){
			 $scope.pageOperation=data;
			 $scope.pages=new Array(data.totalpages);
	 });
	 
	
	 
	 };
	 $scope.gotopage=function(p){
		 $scope.pagecourante=p;
		 $scope.chargeroperation();
	 };
	 $scope.valideropration=function(){
		 var params="";
		 if($scope.operation.type=='virement'){
			 params="cpt1="+$scope.codeCompte+"&cpt2="+$scope.operation.cpt2+"&montant="+$scope.operation.montant+"&codeEmpl=1"
		 }
		 else{
			 params="code="+$scope.codeCompte+"&montant="+$scope.operation.montant+"&codeEmpl=1";
		 }
		 $http({
			 method  :  'PUT',
			 url     :  $scope.operation.type,
			 data    :  params,
			 headers :  {'Content-type': 'application/x-www-form-urlencoded'}
		 })
		 .success(function(data){
			 $scope.chargercompte();
		//	 $scope.loadoperation();
		 })
		 .error(function(data){
			 $scope.errorMessage=data.message;
		
		 });
		 }; 	
 });
