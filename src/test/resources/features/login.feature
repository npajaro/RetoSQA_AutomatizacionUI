Feature: Login
  Description: HU
    As a registered user
    I want to login to the page
    To access my services and content

  Scenario: Successful login
    Given that I'm on the home page
    And I go to the login page
    When I enter my email and password
    And I click on the “Iniciar Sesion” button
    Then I see a welcome message with my name


  Scenario: Unsuccessful login
    When I enter an incorrect email or password
    And I click on the “Iniciar Sesion” button
    Then I see an error message indicating that the credentials are invalid
