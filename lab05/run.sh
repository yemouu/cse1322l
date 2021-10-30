#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "B" \
	              "Lord of the Rings" \
	              "Tolkien" \
	              "34" \
	              "P" \
	              "Times" \
	              "1234" \
	              "B" \
	              "War and Peace" \
	              "Tolstoy" \
	              "4567" \
	              "B" \
	              "Alice in Wonderland" \
	              "Lewis Carroll" \
	              "7890" \
	              "P" \
	              "New Yorker" \
	              "45" | java myCollection
} > output.txt 2>&1
