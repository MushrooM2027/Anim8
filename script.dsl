create window "Test Components Window" size 800 x 600


// Add a TreeTableView
add treeTableView id myTreeTable columns "Name", "Value"
    editable true
    showRoot true

// Add a ScrollPane wrapping multiple labels
add scrollPane {
    label "Item 1"
    label "Item 2"
    label "Item 3"
    label "Item 4"
    label "Item 5"
    label "Item 6"
    label "Item 7"
} fitToHeight true fitToWidth true pannable true

// Add a SplitPane with two buttons
add splitPane orientation HORIZONTAL {
    button "Left Side"
    button "Right Side"
} dividerPositions 0.5
