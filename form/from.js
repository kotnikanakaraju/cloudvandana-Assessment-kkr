// Function to reset the form
function resetForm() {
    document.getElementById("surveyForm").reset();
}

function submitForm() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var dob = document.getElementById("dob").value;
    var country = document.getElementById("country").value;
    var gender = document.querySelectorAll('input[name="gender"]:checked');
    var profession = document.getElementById("profession").value;
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;

    var message = "First Name: " + firstName + "\n" +
        "Last Name: " + lastName + "\n" +
        "Date of Birth: " + dob + "\n" +
        "Country: " + country + "\n" +
        "Gender: " + (gender.length > 0 ? gender[0].value : "Not specified") + "\n" +
        "Profession: " + profession + "\n" +
        "Email: " + email + "\n" +
        "Mobile Number: " + mobile;

    alert(message);
    resetForm();
}
