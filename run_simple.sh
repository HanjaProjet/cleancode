#bin/sh

module=$1
exercise=$2;
file=$3;
package=$4

#com/byoskill/trainings/cleancode/cards

cp -f $3 cleancode/$1/$2/src/test/java/$4

cd cleancode/$1/$2
mvn clean test

