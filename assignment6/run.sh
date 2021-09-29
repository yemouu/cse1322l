#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "4" \
	              "1" \
	              "0" \
	              "Jane" \
	              "3" \
	              "1" \
	              "3" \
	              "Paul" \
	              "2" \
	              "1" \
	              "2" \
	              "Maeve" \
	              "1" \
	              "1" \
	              "0" \
	              "Tim" \
	              "5" | java Main
} > output.txt 2>&1
