package com.example.parcelableproject;
import android.os.Parcel;
import android.os.Parcelable;

class Student implements Parcelable {

    String mSName;
    String mSAge;
    String mSAddress;
    String mSCourse;

    //A constructor that initializes the Student object

    public Student(String mSName, String mSAge, String mSAddress, String mSCourse) {
        this.mSName = mSName;
        this.mSAge = mSAge;
        this.mSAddress = mSAddress;
        this.mSCourse = mSCourse;
    }

    //Retrieving Student data from Parcel object

    private Student(Parcel in) {

        this.mSName=in.readString();
        this.mSAge=in.readString();
        this.mSAddress=in.readString();
        this.mSCourse=in.readString();

        return;
    }
    // the object CREATOR


    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mSName);
        dest.writeString(mSAge);
        dest.writeString(mSAddress);
        dest.writeString(mSCourse);

    }
}
