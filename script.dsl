create window "User Form" size 600 x 400 layout VBox
add label "Enter your name:" font "Arial" size 16 color "blue"
add textfield id nameField placeholder "Your name" default "John Doe" width 200
add checkbox "Accept Terms" id termsCheck checked
add dropdown id country options "India", "USA", "UK"
add button "Submit" onClick showAlert "Form submitted!" width 100
