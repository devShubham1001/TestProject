	
	function registrationformValidate(){
	var name=document.registration.uname.value;
	
	//var gender = document.registration.gender.value;
	
	var address=document.registration.uaddress.value;
	var email=document.registration.umail.value;
	//var language = document.registration.languages.value;
	var phone=document.registration.uphone.value;
	var userid=document.registration.uid.value;
	var userpassword=document.registration.upass.value;
	if(name==null || name==""){
		alert("first name can't be blank");
		return false;
		}

	if(address==null || address==""){
		alert("A proper address is required");
		return false;
		}

	if(email==null || email==""){
		alert("email can't be blank");
		return false;
		}
	
	var checkedValue = null; 
	var inputElements = document.getElementsByClassName('messageCheckbox');
	for(var i=0; inputElements[i];i++){
	      if(!inputElements[i].checked || !inputElements[i++].checked){
	           alert("you have to select atleast one language")
	           return false;
	      }
	}

	if(phone==null || phone==""){
		alert("you have to give your Phone Number");
		return false;
		}

	if(userid==null || userid == ""){
		alert("A proper userID is required");
		return false;
		}
	
	if(userpassword==null || userpassword == ""){
		alert("A proper user passsword is required");
		return false;
		}
	
	

	}