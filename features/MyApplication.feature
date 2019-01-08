Feature: Test Facebook smoke scenario
	Scenario Outline: Test Login with valid credentials 
	    Given open chrome and start application
	    When enter valid "<username>" and valid "<password>"
	    Then user should be able to login successfully
	Examples:
	|username|password|
	|umakvdu@gmail.com|123456|
	|umakvdu@gmail.com|123|
	|umakvdu@gmail.com|12345|
		
	    
	    