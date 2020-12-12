/**
 * Copyright 2020 Mahesh V. Pawar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.maheshvpawar.tourguide;

/**
 * Creating a custom class called Place. Objects of this class will have 2 propeties:
 * ImageResourceId, PlaceTitle
 */
public class Place {

    // ImageResourceId for place
    private int mImageResourceID;

    // Title for the Place
    private String mPlaceTitle;

    /**
     * Create a new Place object.
     *
     * @param mImageResourceId is ImageResource for place.
     * @param mPlaceTitle      is Title for place.
     */
    public Place(int mImageResourceId, String mPlaceTitle) {
        this.mImageResourceID = mImageResourceId;
        this.mPlaceTitle = mPlaceTitle;
    }

    /**
     * Get the ImageResource for Place
     */
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Get the ImageResource for Place
     */
    public String getmPlaceTitle() {
        return mPlaceTitle;
    }
}
