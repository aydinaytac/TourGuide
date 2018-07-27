package com.example.android.tourguide;

/**
 * {@link Izmir} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Izmir {

    /** Name of the Izmir object */
    private String mIzmirName;

    /** Name of the Izmir object */
    private String mIzmirAddress;

    /** Info about the Izmir object */
    private String mIzmirDetail;

    /** Phone Number about the Izmir object */
    private String mIzmirPhoneNumber;

    /** Web address about the Izmir object */
    private String mIzmirWebAddress;

    /** Image resource ID for the Izmir object */
    private int mImageResourceId;

    /**
     * Create a new Izmir object. Constructor for places
     *
     * @param izmirName is the name of the Izmir object
     * @param izmirAddress is the address of the Izmir object
     * @param izmirDetail is the detail info of the Izmir object
     * @param imageResourceId is the drawable resource ID for the image associated with the Izmir object
     *
     */
    public Izmir(String izmirName, String izmirAddress, String izmirDetail, int imageResourceId) {
        mIzmirName = izmirName;
        mIzmirAddress = izmirAddress;
        mIzmirDetail = izmirDetail;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Izmir object. Constructor for food
     *
     * @param izmirName is the name of the Izmir object
     * @param izmirDetail is the detail info of the Izmir object
     * @param imageResourceId is the drawable resource ID for the image associated with the Izmir object
     *
     */
    public Izmir(String izmirName, String izmirDetail, int imageResourceId) {
        mIzmirName = izmirName;
        mIzmirDetail = izmirDetail;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Izmir object. Constructor for hotels and cinemas
     *
     * @param izmirName is the name of the Izmir object
     * @param izmirAddress is the address of the Izmir object
     * @param izmirDetail is the detail info of the Izmir object
     * @param izmirWebAddress is the web address of the Izmir object
     * @param imageResourceId is the drawable resource ID for the image associated with the Izmir object
     *
     */
    public Izmir(String izmirName, String izmirAddress, String izmirDetail, String izmirPhoneNumber, String izmirWebAddress, int imageResourceId) {
        mIzmirName = izmirName;
        mIzmirAddress = izmirAddress;
        mIzmirDetail = izmirDetail;
        mIzmirPhoneNumber = izmirPhoneNumber;
        mIzmirWebAddress = izmirWebAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the header of the Izmir object
     */
    public String getIzmirName() {
        return mIzmirName;
    }

    /**
     * Get the address of the Izmir object
     */
    public String getIzmirAddress() {

        return mIzmirAddress;
    }

    /**
     * Get the detail of the Izmir object
     */
    public String getIzmirDetail() {

        return mIzmirDetail;
    }

    /**
     * Return the phone number of the Izmir object.
     */
    public String getmIzmirPhoneNumber() {

        return mIzmirPhoneNumber;
    }

    /**
     * Return the image web address of the Izmir object.
     */
    public String getIzmirWebAddress() {

        return mIzmirWebAddress;
    }

    /**
     * Return the image resource ID of the Izmir Object.
     */
    public int getImageResourceId() {

        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Izmir{" +
                "mIzmirName='" + mIzmirName + '\'' +
                ", mIzmirAddress='" + mIzmirAddress + '\'' +
                ", mIzmirDetail='" + mIzmirDetail + '\'' +
                ", mIzmirPhoneNumber='" + mIzmirPhoneNumber + '\'' +
                ", mIzmirWebAddress='" + mIzmirWebAddress + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}