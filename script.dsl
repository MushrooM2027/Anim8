create window "Test Components Window" size 800 x 600

add button "Click Me"
    onClick print "Button was clicked!"
    width 120
    defaultButton
    row 0
    column 1
    //animate fade duration 1500 cycleCount 2 autoReverse true
    effect dropShadow
    animate rotate duration 1000 cycleCount 3 autoReverse false
    onEvent "mouseEntered" do showAlert "Hovered over the button!"

