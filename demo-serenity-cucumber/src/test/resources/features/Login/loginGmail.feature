Feature: login to system
  in order to do...
  As an user
  I would like to login to system

  @tag1
  Scenario Outline: SignIn Gmail
    Given I am on gmail page
    When I enter my <Email>
    And I click the next button
    And I enter my <Password>
    And I click the signIn button
    Then I see an alert message is <Message>
    And I close my browser
      | Email                       | Password   | Message                                         |
      | hanglt002.buitech@gmail.com |            | Please enter your password.                     |
      |                             |            | Please enter your email.                        |
      | dsfdf                       |            | Please enter a valid email address.             |
      | hanglt002.buitech@gmail.com | buitech123 |                                                 |
      | hanglt002.buitech@gmail.com | afff       | The email and password you entered don't match. |

  @tag2
  Scenario: login gmail in case of leave password field is blank
    Given I am on Home page
    When I input my email is "hanglt002.buitech@gmail.com"
    And I click next button
    And I leave password field is "  "
    And I click signIn button
    Then I should see an alert message is "Please enter your password."
    And I close my browser

  @tag3
  Scenario: login gmail in case of fill invalid data into password and mail
    Given I am on Home page
    When I input my email is "hanglt002.buitech@gmail.com"
    And I click next button
    And I leave password field is "afff"
    And I click signIn button
    Then I should see an alert message is "The email and password you entered don't match."
    And I close my browser
