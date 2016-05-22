/*
 * DesfireFile.java
 *
 * Copyright (C) 2011 Eric Butler
 *
 * Authors:
 * Eric Butler <eric@codebutler.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.card.desfire.files;

import com.codebutler.farebot.card.desfire.settings.DesfireFileSettings;
import com.codebutler.farebot.card.desfire.settings.RecordDesfireFileSettings;
import com.codebutler.farebot.card.desfire.settings.ValueDesfireFileSettings;
import com.codebutler.farebot.xml.Base64String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="file")
public class DesfireFile {
    @Attribute(name="id") private int mId;
    @Element(name="settings", required=false) private DesfireFileSettings mSettings;
    @Element(name="data", required=false) private Base64String mData;

    public static DesfireFile create(int fileId, DesfireFileSettings fileSettings, byte[] fileData) {
        if (fileSettings instanceof RecordDesfireFileSettings) {
            return new RecordDesfireFile(fileId, fileSettings, fileData);
        } else if (fileSettings instanceof ValueDesfireFileSettings) {
            return new ValueDesfireFile(fileId, fileSettings, fileData);
        } else {
            return new DesfireFile(fileId, fileSettings, fileData);
        }
    }

    DesfireFile() { /* For XML Serializer */ }

    DesfireFile(int fileId, DesfireFileSettings fileSettings, byte[] fileData) {
        mId = fileId;
        mSettings = fileSettings;
        mData = new Base64String(fileData);
    }

    public DesfireFileSettings getFileSettings() {
        return mSettings;
    }

    public int getId() {
        return mId;
    }

    public byte[] getData() {
        return mData.getData();
    }
}
