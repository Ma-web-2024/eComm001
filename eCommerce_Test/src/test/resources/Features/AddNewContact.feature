Feature: Add New Contact
Scenario: Fill in a contact information

 Given user launch browser
 And user opens URL "https://thinking-tester-contact-list.herokuapp.com/"
 When user enters Email as "boudhibamanel+0010230@gmail.com" and Password as "123456789"
 And clicks on submit button
 Then user can view contact list page
 When user clicks on add new contact button
 Then user cann viwe add contact page
 When user enters contact info
 And clicks on submit button
 Then new contact is added successfully