Feature: Authorization user


  Scenario: Authorization user in LK on site OTUS
    Given We have user site OTUS
    When User enters login "KseniyaCharkina@gmail.com" and password "Alaundo123"
    Then User in personal account
