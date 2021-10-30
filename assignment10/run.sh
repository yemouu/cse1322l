#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "3" \
	              "4" \
	              "3" \
	              "3" \
	              "4" \
	              "2" \
	              "2" \
	              "3" \
	              "4" \
	              "3" \
	              "3" \
	              "3" \
	              "4" \
	              "5" \
	              "2" \
	              "5" \
	              "8" \
	              "9" | java Main
} > output.txt 2>&1
