

function  doValidations(frm){

	//empty old form validation error messages
	document.getElementById("enameErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	document.getElementById("deptnoErr").innerHTML="";

       alert("Client side form validations");
 
  //read form comp values
    let name=frm.ename.value;
	let  desg=frm.job.value;
	let  salary=frm.sal.value;
	let  deptno=frm.deptno.value;
    let    isValid=true;
	//write client side form validation logics
	  if(name==""){   //required rule
		   document.getElementById("enameErr").innerHTML="Employee name is mandatory";
		   isValid=false;
	  }
	  else if(name.length<5 || name.length>15){  //length rule
           document.getElementById("enameErr").innerHTML="Employee name must contain >=5 chars and <=15";
             isValid=false;
	  }

	  if(desg==""){   //required rule
		   document.getElementById("jobErr").innerHTML="Employee Job is mandatory";
		   isValid=false;
	  }
	  else if(desg.length<5 || desg.length>10){  //length rule
           document.getElementById("jobErr").innerHTML="Employee Job  must contain >=5 chars and <=10";
             isValid=false;
	  }

	  if(salary==""){   //required rule
		   document.getElementById("salErr").innerHTML="Employee Salary is mandatory";
		   isValid=false;
	  }
	  else if(isNaN(salary)){  //numeric value
           document.getElementById("salErr").innerHTML="Employee Salary must be numberic value";
             isValid=false;
	  }
	  else if(salary<=1000 || salary>=200000){
		  document.getElementById("salErr").innerHTML="Employee salary must be  there in the range of 1000 to 200000";
		  isValid=false;
	  }

	  
	  if(deptno==""){   //required rule
		   document.getElementById("deptnoErr").innerHTML="Employee deptno is mandatory";
		   isValid=false;
	  }
            //chanage  the hidden box vflag value to "yes" indicating that  the Client side form validations are done
             frm.vflag.value="yes";
	  return  isValid;
}