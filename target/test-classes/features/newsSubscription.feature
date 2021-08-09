Feature: Subscribe to news


  Scenario: User subscribe to news site OTUS
    Given We have user
    When User enters mail "yomeb23492@o3live.com" into the form
    Then User subscribe
