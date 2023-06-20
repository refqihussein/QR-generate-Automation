@email
Feature: QR code generate
 
  Scenario: Email generate QR
    Given I want to open QR generate website
    Then I want to click email section
    Then I fill email "random@email.com"
    Then I click submit button
    Then I Download the QR