#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "Small" \
	              "8" \
	              "8" \
	              "8" \
	              "4" \
	              "4" \
	              "4" \
	              "2" \
	              "6" \
	              "2" \
	              "2" \
	              "Q" | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "Big" \
	              "8" \
	              "8" \
	              "8" \
	              "4" \
	              "4" \
	              "4" \
	              "4" \
	              "4" \
	              "Q" | java Main
} > output.txt 2>&1
