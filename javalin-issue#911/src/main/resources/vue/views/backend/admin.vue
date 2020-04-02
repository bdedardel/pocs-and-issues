<template id="admin-login">
<div>
<div class="navbar-fixed">
	<nav>
		<div class="nav-wrapper">				
			<a href="#!" class="brand-logo left"><i class="material-icons">menu</i>My app</a>
		</div>
	</nav>
</div>
<div class="container" style="margin-top:10%">
	<div class="row">
	    <form class="col s12">
	        <div class="row">
	            <div class="input-field col s6 offset-s3">
	                <input id="adminlogin" v-model="adminlogin" type="text" name="adminlogin" class="validate">
	                    <label for="adminlogin">Login</label>
	            </div>
	        </div>
	        <div class="row">
	            <div class="input-field col s6 offset-s3">
	                <input id="adminpassword" v-model="adminpassword" type="password" name="adminpassword" class="validate">
	                    <label for="adminpassword">Password</label>
	            </div>
	        </div>	       
	        <div class="row">
	            <div class="col s6 offset-s3">	                
				  <button class="btn waves-effect waves-light right" type="submit">&nbsp;&nbsp;&nbsp;Login&nbsp;&nbsp;&nbsp;
				    <i class="material-icons right">send</i>
				  </button>        
	            </div>
	        </div>
	    </form>
	</div>
</div>
</div>
</template>
<script>
    var adminLogin = Vue.component("admin-login", {
    	template: "#admin-login",
    	data: function () {
		  return {
		    adminlogin: null,
	      	adminpassword: null,
	      	sessioncode: null
		  }
		},
		created() {
			
        },
        mounted() {
        	this.adminlogin = '';
	      	this.adminpassword = '';
	      	this.sessioncode = '';
			M.updateTextFields();
        },
	    methods: {
	    	checkForm: function (e) {
		    },
        },     	
    });
</script>
<style>

</style>
