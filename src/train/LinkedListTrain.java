package train;

import java.util.NoSuchElementException;

public class LinkedListTrain {
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain() {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     *
     * @return the first wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     *
     * @param wagon the wagon node to add
     */
// Opgave 1
    public void addFirst(WagonNode wagon) {
        if (this.firstWagon != null) {
            wagon.setNextWagon(this.firstWagon);
        }
        firstWagon = wagon;


        //throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @return the removed wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */


    // Opgave 2
    public WagonNode removeFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException("Toget er tomt");
        }
        WagonNode removedWagon = this.firstWagon;
        this.firstWagon = removedWagon.getNextWagon();
        removedWagon.setNextWagon(null);
        return removedWagon;
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     *
     * @return the number of wagon nodes
     */

    // Opgave 3
    public int count() {
        WagonNode temp = firstWagon;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNextWagon();
        }
        return count;
        //throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     * <code>false</code> otherwise
     */

    // Opgave 4
    public boolean remove(WagonNode wagon) {
        // TODO: Assignment 4: Implement this remove method..
        if (this.firstWagon == wagon) {
            this.firstWagon = firstWagon.getNextWagon();
            return true;
        }
        WagonNode currentWagon = this.firstWagon;
        while (currentWagon.getNextWagon() != null) {
            if (currentWagon.getNextWagon() == wagon) {
                currentWagon.setNextWagon(wagon.getNextWagon());
                return true;
            }
            currentWagon = currentWagon.getNextWagon();
        }
        return false;
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     *
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */

    // Opgave 5
    public void insertAt(WagonNode wagon, int position) {
        int currentPos = 0;
        WagonNode currentWagon = firstWagon;
        while (currentPos < position) {
            if (currentPos == position - 1) {
                wagon.setNextWagon(currentWagon.getNextWagon());
                currentWagon.setNextWagon(wagon);
            }
            currentWagon = currentWagon.getNextWagon();
            currentPos++;
        }


//        throw new UnsupportedOperationException("Not implemented");
    }
}
