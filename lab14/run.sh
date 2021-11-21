#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "1" \
	              "Jaws" \
	              "Steven Spielberg" \
	              "1975" \
	              "19.95" \
	              "2" \
	              "1" \
	              "Jurassic Park" \
	              "Steven Spielberg" \
	              "1993" \
	              "17.99" \
	              "2" \
	              "0" | java Main
} > output.txt 2>&1
