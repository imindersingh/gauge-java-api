Login
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs


User can login sucessfully with valid email and password
--------------------------------------------------------

Login to reqres with email <email> and password <password>
Then the response will be 200
Response contains token

User can't login with missing password
---------------------------------------


