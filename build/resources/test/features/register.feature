Feature: Registration in Librería Nacional
  Description: HU
    As a user of the Librería Nacional Virtual Store
    I want to register using my social media or email
    So that I can buy books online


  //Scenario: Successful registration

  //  Given I am on the Librería Nacional page
  //  And I go to the user registration page
  //  When I fill out the registration form
  //  And I accept the privacy and data management policies
  //  And I click on the button register
  //  Then I see a registration confirmation message

    Scenario: Failed registration

      When I fill out the registration form with invalid data
      And I accept the privacy and data management policies with invalid data
      And I click on the button register with invalid data
      Then I see an error message indicating that the email address is invalid