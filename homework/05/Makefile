BUILD_IMG = openjdk:15-alpine3.12

run:
	@docker run --rm -it -v $(CURDIR)/src:/src -w /src $(BUILD_IMG) sh -c 'javac /src/Main.java && java /src/Main.java'