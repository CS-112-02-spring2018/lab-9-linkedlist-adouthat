

public class IntegerLinkedListTest
{
  public static void main( String [] args )
  {
    // construct empty IntegerLinkedList
    IntegerLinkedList numbers = new IntegerLinkedList( );
    System.out.println( "Number of items in the list: "
     + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    numbers.insert( 7 );  // insert in empty list
    System.out.println( "Number of items in the list: "
     + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    numbers.insert( 2 );  // insert in list with one item
    System.out.println( "Number of items in the list: "
     + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    numbers.insert( 5 );  // insert in list with two items
    System.out.println( "Number of items in the list: "
     + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    if ( ! numbers.delete( 8 ) )   // unsuccessful - not in list
        System.out.println( "8 could not be deleted:" );

    if ( numbers.delete( 2 ) )     // successful
        System.out.println( "2 was successfully deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    if ( numbers.delete( 7 ) )    // successful
        System.out.println( "7 was successfully deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    if ( numbers.delete( 5 ) )    // successful
        System.out.println( "5 was successfully deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );

    if ( ! numbers.delete( 8 ) )  // unsuccessful - empty list
        System.out.println( "8 could not be deleted:" );
    System.out.println( "Number of items in the list: "
       + numbers.getNumberOfItems( ) + "\n" + numbers.toString( ) );
  }
}
