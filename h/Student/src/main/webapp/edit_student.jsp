<%@ include file="header.jsp"%>


<%@page import="java.util.List" %>
<body>
<section class="h-100 bg-dark">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                alt="Sample photo" class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black">
                <h3 class="mb-5 text-uppercase">Edit Student Details</h3>
				<form action="register" method="post">


                    <div class="form-outline">
                      <input type="text" name="id" id="form3Example1m" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m" >Student ID</label>
      
                </div>

                    <div class="form-outline">
                      <input type="text" name="name" id="form3Example1m" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m">Student Name</label>
                    </div>       

                  <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="age" id="form3Example1m" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m">Student Age</label>
                    </div>       
                </div>

                <div class="form-outline mb-4">
                  <input type="text" name="address" id="form3Example8" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example8">Address</label>
                </div>
                
                 <div class="form-outline mb-4">
                  <select name="grade" class="form-select" aria-label="Default select example">
					<option value="1" > Grade 1 </option>
                  	 <option value="2" > Grade 2 </option>
                  	 <option value="3" > Grade 3 </option>
                  	 <option value="4" > Grade 4 </option>
                  	 <option value="5" > Grade 5 </option>
                  	 <option value="6" > Grade 6 </option>
                  	 <option value="7" > Grade 7 </option>
                  	 <option value="8" > Grade 8 </option>
                  	 <option value="9" > Grade 9 </option>
                  	 <option value="10" > Grade 10 </option>
                  	 <option value="11" > Grade 11 </option>
                  	 <option value="12" > Grade 12 </option>
					</select>
               
                  <label class="form-label" for="form3Example8">Student grade</label>
                </div>

                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">



                </div>



                <div class="d-flex justify-content-end pt-3">
                  <button type="button" class="btn btn-light btn-lg">Reset all</button>

                  <button type="submit" value="register" class="btn btn-warning btn-lg ms-2">Submit form</button>
                </div>
</form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</body>
<%@ include file="Header/footer.jsp"%>
</html>