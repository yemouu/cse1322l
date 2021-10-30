#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "3" \
	              "50" \
	              "1" \
	              "30" \
	              "5" \
	              "1" \
	              "30" \
	              "5" \
	              "6" \
	              "4" \
	              "500" \
	              "4" \
	              "300" \
	              "6" \
	              "4" \
	              "100" \
	              "4" \
	              "100" \
	              "4" \
	              "100" \
	              "4" \
	              "100" \
	              "6" \
	              "7" \
	              "6" \
	              "2" \
	              "750" \
	              "6" \
	              "8" | java Main
} > output.txt 2>&1
