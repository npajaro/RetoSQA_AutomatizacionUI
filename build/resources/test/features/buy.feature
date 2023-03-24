Feature: Search and purchase a book on the website

  Background: User is registered
    Given I navigate to the user registration page
    When I fill out the registration form
    And I accept the privacy and data management policies
    And I click on the button register
    Then I see a registration confirmation message

    Scenario: Purchase a book
      When I search for the book Android Manual Práctico para todos los Niveles
      And I should see results related to the book title
      And I choose Agregar al carrito
      And I close the modal
      And I choose Ver Carrito
      And I add 2 books to the cart
      And I choose Continuar con la compra
      And I add information in the mandatory fields form
      Then I validate that there are 2 books in the cart
      And I valid the total price