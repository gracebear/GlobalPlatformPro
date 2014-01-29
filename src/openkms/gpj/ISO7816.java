/*
 * gpj - Global Platform for Java SmartCardIO
 *
 * Copyright (C) 2009 Wojciech Mostowski, woj@cs.ru.nl
 * Copyright (C) 2009 Francois Kooman, F.Kooman@student.science.ru.nl
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 *
 */

package openkms.gpj;

/**
 * Constants interface for ISO 7816 (and friends).
 *
 * @author Engelbert Hubbers (hubbers@cs.ru.nl)
 * @author Martijn Oostdijk (martijno@cs.ru.nl)
 * @author Martin Paljak
 */
public interface ISO7816 {

	public static final int OFFSET_CLA = 0;

	public static final int OFFSET_INS = 1;

	public static final int OFFSET_P1 = 2;

	public static final int OFFSET_P2 = 3;

	public static final int OFFSET_LC = 4;

	public static final int OFFSET_CDATA = 5;

	public static final int CLA_ISO7816 = 0x00;

	public static final int INS_ERASE_BINARY_0E = 0x0E;

	public static final int INS_VERIFY_20 = 0x20;

	public static final int INS_CHANGE_CHV_24 = 0x24;

	public static final int INS_UNBLOCK_CHV_2C = 0x2C;

	public static final int INS_EXTERNAL_AUTHENTICATE_82 = 0x82;

	public static final int INS_MUTUAL_AUTHENTICATE_82 = 0x82;

	public static final int INS_GET_CHALLENGE_84 = 0x84;

	public static final int INS_ASK_RANDOM = 0x84;

	public static final int INS_GIVE_RANDOM = 0x86;

	public static final int INS_INTERNAL_AUTHENTICATE = 0x88;

	public static final int INS_SEEK = 0xA2;

	public static final int INS_SELECT = 0xA4;

	public static final int INS_SELECT_FILE = 0xA4;

	public static final int INS_CLOSE_APPLICATION = 0xAC;

	public static final int INS_READ_BINARY = 0xB0;

	public static final int INS_READ_BINARY2 = 0xB1;

	public static final int INS_READ_RECORD = 0xB2;

	public static final int INS_READ_RECORD2 = 0xB3;

	public static final int INS_READ_RECORDS = 0xB2;

	public static final int INS_GET_RESPONSE = 0xC0;

	public static final int INS_ENVELOPE = 0xC2;

	public static final int INS_GET_DATA = 0xCA;

	public static final int INS_WRITE_BINARY = 0xD0;

	public static final int INS_WRITE_RECORD = 0xD2;

	public static final int INS_UPDATE_BINARY = 0xD6;

	public static final int INS_LOAD_KEY_FILE = 0xD8;

	public static final int INS_PUT_DATA = 0xDA;

	public static final int INS_UPDATE_RECORD = 0xDC;

	public static final int INS_CREATE_FILE = 0xE0;

	public static final int INS_APPEND_RECORD = 0xE2;

	public static final int INS_DELETE_FILE = 0xE4;

	///////////////////////////////////////////////////////
	public static final int SW_BYTES_REMAINING_00 = 0x6100;

	public static final int SW_END_OF_FILE = 0x6282;

	public static final int SW_LESS_DATA_RESPONDED_THAN_REQUESTED = 0x6287;

	public static final int SW_WRONG_LENGTH = 0x6700;

	public static final int SW_SECURITY_STATUS_NOT_SATISFIED = 0x6982;

	public static final int SW_AUTHENTICATION_METHOD_BLOCKED = 0x6983;

	public static final int SW_DATA_INVALID = 0x6984;

	public static final int SW_CONDITIONS_OF_USE_NOT_SATISFIED = 0x6985;

	public static final int SW_COMMAND_NOT_ALLOWED = 0x6986;

	public static final int SW_EXPECTED_SM_DATA_OBJECTS_MISSING = 0x6987;

	public static final int SW_SM_DATA_OBJECTS_INCORRECT = 0x6988;

	public static final int SW_KEY_USAGE_ERROR = 0x69C1;

	public static final int SW_WRONG_DATA = 0x6A80;

	public static final int SW_FILEHEADER_INCONSISTENT = 0x6A80;

	public static final int SW_FUNC_NOT_SUPPORTED = 0x6A81;

	public static final int SW_FILE_NOT_FOUND = 0x6A82;

	public static final int SW_RECORD_NOT_FOUND = 0x6A83;

	public static final int SW_FILE_FULL = 0x6A84;

	public static final int SW_OUT_OF_MEMORY = 0x6A84;

	public static final int SW_INCORRECT_P1P2 = 0x6A86;

	public static final int SW_KEY_NOT_FOUND = 0x6A88;

	public static final int SW_WRONG_P1P2 = 0x6B00;

	public static final int SW_CORRECT_LENGTH_00 = 0x6C00;

	public static final int SW_INS_NOT_SUPPORTED = 0x6D00;

	public static final int SW_CLA_NOT_SUPPORTED = 0x6E00;

	public static final int SW_NO_PRECISE_DIAGNOSIS = 0x6F00;

	public static final int SW_CARD_TERMINATED = 0x6FFF;

	public static final int SW_NO_ERROR = 0x9000;
}
