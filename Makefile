.PHONY: test
test:
	@mvn test && $(RM) -r target

.PHONY: lint
lint:
	@mvn checkstyle:check
