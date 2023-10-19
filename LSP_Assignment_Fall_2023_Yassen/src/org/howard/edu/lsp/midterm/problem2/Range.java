package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int start;
    private int end;
    // Creating class methods Range, to have a start and end
    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Checks if the given value is in the range of numbers
    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }

    // Compares two ranges to see if they overlap at all in their start and end
    public boolean doRangesOverlap(Range otherRange) {
        return this.end >= otherRange.start && this.start <= otherRange.end;
    }

    // Returns the size of the range
    public int size() {
        return end - start + 1;
    }
}
