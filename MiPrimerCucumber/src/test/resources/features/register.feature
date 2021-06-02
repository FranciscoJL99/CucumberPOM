Feature: Register
  I as a web user
  I want to register in advantage
  To be able to buy a product

  Scenario Outline: Register
    Given enter the page to register
    When  direct the form
      | userName   | email   | password   |
      | <userName> | <email> | <password> |
    Then should see him username in the portal
      | userName   |
      | <userName> |
    Examples:
      | userName | email            | password    |
      | Andrea   | andrea@gmail.com | Control123* |
      | Andres   | andres@gmail.com | Control123* |
