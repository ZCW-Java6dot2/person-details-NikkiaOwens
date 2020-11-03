package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";

        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        Integer counter = -1;
        while (counter < personArray.length -1) {  // what does adding this -1 do...?
            counter++;
            Person stringRepresentation =  personArray[counter];
            String apple = stringRepresentation.toString();
            result = result + apple;
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        //return apple + result;

        return result;
    }



    public String forLoop() {
        String result = "";

        for (int i = 0; i < personArray.length; i++) {
            Person stringRepresentation =  personArray[i];
            String apple = stringRepresentation.toString();
            result = result + apple;
        }

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
            for ( Person pick : personArray) {
               String stringRepresentation = pick.toString();
               result = result + stringRepresentation;
            }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
