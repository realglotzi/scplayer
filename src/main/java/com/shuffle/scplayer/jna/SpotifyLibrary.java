package com.shuffle.scplayer.jna;
import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.ochafik.lang.jnaerator.runtime.NativeSizeByReference;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
/**
 * JNA Wrapper for library <b>SpotifyLibrary</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface SpotifyLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "libspotify_embedded_shared.so";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(SpotifyLibrary.JNA_LIBRARY_NAME);
	public static final SpotifyLibrary INSTANCE = (SpotifyLibrary)Native.loadLibrary(SpotifyLibrary.JNA_LIBRARY_NAME, SpotifyLibrary.class);
	/** enum values */
	public static interface SpError {
		/** <i>native declaration : line 7</i> */
		public static final int kSpErrorOk = 0;
		/** <i>native declaration : line 8</i> */
		public static final int kSpErrorFailed = 1;
		/** <i>native declaration : line 9</i> */
		public static final int kSpErrorInitFailed = 2;
		/** <i>native declaration : line 10</i> */
		public static final int kSpErrorWrongAPIVersion = 3;
		/** <i>native declaration : line 11</i> */
		public static final int kSpErrorNullArgument = 4;
		/** <i>native declaration : line 12</i> */
		public static final int kSpErrorInvalidArgument = 5;
		/** <i>native declaration : line 13</i> */
		public static final int kSpErrorUninitialized = 6;
		/** <i>native declaration : line 14</i> */
		public static final int kSpErrorAlreadyInitialized = 7;
		/** <i>native declaration : line 15</i> */
		public static final int kSpErrorLoginBadCredentials = 8;
		/** <i>native declaration : line 16</i> */
		public static final int kSpErrorNeedsPremium = 9;
		/** <i>native declaration : line 17</i> */
		public static final int kSpErrorTravelRestriction = 10;
		/** <i>native declaration : line 18</i> */
		public static final int kSpErrorApplicationBanned = 11;
		/** <i>native declaration : line 19</i> */
		public static final int kSpErrorGeneralLoginError = 12;
		/** <i>native declaration : line 20</i> */
		public static final int kSpErrorUnsupported = 13;
		/** <i>native declaration : line 21</i> */
		public static final int kSpErrorNotActiveDevice = 14;
		/** <i>native declaration : line 22</i> */
		public static final int kSpErrorPlaybackErrorStart = 1000;
		/** <i>native declaration : line 23</i> */
		public static final int kSpErrorGeneralPlaybackError = 1001;
		/** <i>native declaration : line 24</i> */
		public static final int kSpErrorPlaybackRateLimited = 1002;
		/** <i>native declaration : line 25</i> */
		public static final int kSpErrorUnknown = 1003;
	};
	/** enum values */
	public static interface SpConnectionNotify {
		/** <i>native declaration : line 29</i> */
		public static final int kSpConnectionNotifyLoggedIn = 0;
		/** <i>native declaration : line 30</i> */
		public static final int kSpConnectionNotifyLoggedOut = 1;
		/** <i>native declaration : line 31</i> */
		public static final int kSpConnectionNotifyTemporaryError = 2;
	};
	/** enum values */
	public static interface SpPlaybackNotify {
		/** <i>native declaration : line 35</i> */
		public static final int kSpPlaybackNotifyPlay = 0;
		/** <i>native declaration : line 36</i> */
		public static final int kSpPlaybackNotifyPause = 1;
		/** <i>native declaration : line 37</i> */
		public static final int kSpPlaybackNotifyTrackChanged = 2;
		/** <i>native declaration : line 38</i> */
		public static final int kSpPlaybackNotifyNext = 3;
		/** <i>native declaration : line 39</i> */
		public static final int kSpPlaybackNotifyPrev = 4;
		/** <i>native declaration : line 40</i> */
		public static final int kSpPlaybackNotifyShuffleEnabled = 5;
		/** <i>native declaration : line 41</i> */
		public static final int kSpPlaybackNotifyShuffleDisabled = 6;
		/** <i>native declaration : line 42</i> */
		public static final int kSpPlaybackNotifyRepeatEnabled = 7;
		/** <i>native declaration : line 43</i> */
		public static final int kSpPlaybackNotifyRepeatDisabled = 8;
		/** <i>native declaration : line 44</i> */
		public static final int kSpPlaybackNotifyBecameActive = 9;
		/** <i>native declaration : line 45</i> */
		public static final int kSpPlaybackNotifyBecameInactive = 10;
		/** <i>native declaration : line 46</i> */
		public static final int kSpPlaybackNotifyPlayTokenLost = 11;
		/** <i>native declaration : line 47</i> */
		public static final int kSpPlaybackEventAudioFlush = 12;
	};
	/** enum values */
	public static interface SpDeviceType {
		/** <i>native declaration : line 51</i> */
		public static final int kSpDeviceTypeUnknown = 0;
		/** <i>native declaration : line 52</i> */
		public static final int kSpDeviceTypeComputer = 1;
		/** <i>native declaration : line 53</i> */
		public static final int kSpDeviceTypeTablet = 2;
		/** <i>native declaration : line 54</i> */
		public static final int kSpDeviceTypeSmartphone = 3;
		/** <i>native declaration : line 55</i> */
		public static final int kSpDeviceTypeSpeaker = 4;
		/** <i>native declaration : line 56</i> */
		public static final int kSpDeviceTypeTV = 5;
		/** <i>native declaration : line 57</i> */
		public static final int kSpDeviceTypeAVR = 6;
		/** <i>native declaration : line 58</i> */
		public static final int kSpDeviceTypeSTB = 7;
		/** <i>native declaration : line 59</i> */
		public static final int kSpDeviceTypeAudioDongle = 8;
	};
	/** enum values */
	public static interface SpSampleType {
		/** <i>native declaration : line 63</i> */
		public static final int kSpSampleTypeS16NativeEndian = 0;
	};
	/** enum values */
	public static interface SpBitrate {
		/** <i>native declaration : line 67</i> */
		public static final int kSpBitrate90k = 0;
		/** <i>native declaration : line 68</i> */
		public static final int kSpBitrate160k = 1;
		/** <i>native declaration : line 69</i> */
		public static final int kSpBitrate320k = 2;
	};
	/** enum values */
	public static interface SpImageSize {
		/** <i>native declaration : line 73</i> */
		public static final int kSpImageSizeSmall = 0;
		/** <i>native declaration : line 74</i> */
		public static final int kSpImageSizeNormal = 1;
		/** <i>native declaration : line 75</i> */
		public static final int kSpImageSizeLarge = 2;
	};
	/**
	 * Original signature : <code>SpError SpInit(const SpConfig*)</code><br>
	 * <i>native declaration : line 147</i>
	 */
	int SpInit(SpConfig config);
	/**
	 * Original signature : <code>void SpFree()</code><br>
	 * <i>native declaration : line 148</i>
	 */
	void SpFree();
	/**
	 * Original signature : <code>SpError SpPumpEvents()</code><br>
	 * <i>native declaration : line 150</i>
	 */
	int SpPumpEvents();
	/**
	 * Original signature : <code>SpError SpGetMetadataValidRange(int*, int*)</code><br>
	 * <i>native declaration : line 152</i><br>
	 * @deprecated use the safer methods {@link #SpGetMetadataValidRange(java.nio.IntBuffer, java.nio.IntBuffer)} and {@link #SpGetMetadataValidRange(com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	int SpGetMetadataValidRange(IntByReference start, IntByReference end);
	/**
	 * Original signature : <code>SpError SpGetMetadataValidRange(int*, int*)</code><br>
	 * <i>native declaration : line 152</i>
	 */
	int SpGetMetadataValidRange(IntBuffer start, IntBuffer end);
	/**
	 * Original signature : <code>SpError SpGetMetadata(SpMetadata*, int)</code><br>
	 * <i>native declaration : line 153</i>
	 */
	int SpGetMetadata(SpMetadata SpMetadataPtr1, int offset);
	/**
	 * Original signature : <code>SpError SpGetMetadataImageURL(const char*, SpImageSize, char*, size_t)</code><br>
	 * <i>native declaration : line 154</i><br>
	 * @deprecated use the safer methods {@link #SpGetMetadataImageURL(java.lang.String, int, java.nio.ByteBuffer, com.ochafik.lang.jnaerator.runtime.NativeSize)} and {@link #SpGetMetadataImageURL(com.sun.jna.Pointer, int, com.sun.jna.Pointer, com.ochafik.lang.jnaerator.runtime.NativeSize)} instead
	 */
	@Deprecated 
	int SpGetMetadataImageURL(Pointer uri, int imageSize, Pointer url, NativeSize size);
	/**
	 * Original signature : <code>SpError SpGetMetadataImageURL(const char*, SpImageSize, char*, size_t)</code><br>
	 * <i>native declaration : line 154</i>
	 */
	int SpGetMetadataImageURL(String uri, int imageSize, ByteBuffer url, NativeSize size);
	/**
	 * Original signature : <code>SpError SpGetPreset(SpPreset*, size_t*)</code><br>
	 * <i>native declaration : line 157</i>
	 */
	int SpGetPreset(SpPreset preset, NativeSizeByReference size);
	/**
	 * Original signature : <code>SpError SpPlayPreset(const SpPreset*, size_t)</code><br>
	 * <i>native declaration : line 158</i>
	 */
	int SpPlayPreset(SpPreset preset, NativeSize size);
	/**
	 * Original signature : <code>SpError SpSetDisplayName(const char*)</code><br>
	 * <i>native declaration : line 160</i><br>
	 * @deprecated use the safer methods {@link #SpSetDisplayName(java.lang.String)} and {@link #SpSetDisplayName(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SpSetDisplayName(Pointer name);
	/**
	 * Original signature : <code>SpError SpSetDisplayName(const char*)</code><br>
	 * <i>native declaration : line 160</i>
	 */
	int SpSetDisplayName(String name);
	/**
	 * Original signature : <code>char* SpGetLibraryVersion()</code><br>
	 * <i>native declaration : line 161</i>
	 */
	Pointer SpGetLibraryVersion();
	/**
	 * Original signature : <code>SpError SpZeroConfGetVars(SpZeroConfVars*)</code><br>
	 * <i>native declaration : line 163</i>
	 */
	int SpZeroConfGetVars(SpZeroConfVars vars);
	/**
	 * Original signature : <code>SpError SpPlaybackPlay()</code><br>
	 * <i>native declaration : line 165</i>
	 */
	int SpPlaybackPlay();
	/**
	 * Original signature : <code>SpError SpPlaybackPause()</code><br>
	 * <i>native declaration : line 166</i>
	 */
	int SpPlaybackPause();
	/**
	 * Original signature : <code>SpError SpPlaybackSkipToNext()</code><br>
	 * <i>native declaration : line 167</i>
	 */
	int SpPlaybackSkipToNext();
	/**
	 * Original signature : <code>SpError SpPlaybackSkipToPrev()</code><br>
	 * <i>native declaration : line 168</i>
	 */
	int SpPlaybackSkipToPrev();
	/**
	 * Original signature : <code>SpError SpPlaybackSeek(uint32_t)</code><br>
	 * <i>native declaration : line 169</i>
	 */
	int SpPlaybackSeek(int millis);
	/**
	 * Original signature : <code>SpError SpPlaybackUpdateVolume(uint16_t)</code><br>
	 * <i>native declaration : line 170</i>
	 */
	int SpPlaybackUpdateVolume(int volume);
	/**
	 * Original signature : <code>SpError SpPlaybackEnableShuffle(bool)</code><br>
	 * <i>native declaration : line 171</i>
	 */
	int SpPlaybackEnableShuffle(byte enable);
	/**
	 * Original signature : <code>SpError SpPlaybackEnableRepeat(bool)</code><br>
	 * <i>native declaration : line 172</i>
	 */
	int SpPlaybackEnableRepeat(byte enable);
	/**
	 * Original signature : <code>SpError SpPlaybackSetBitrate(SpBitrate)</code><br>
	 * <i>native declaration : line 173</i>
	 */
	int SpPlaybackSetBitrate(int bitrate);
	/**
	 * Original signature : <code>uint16_t SpPlaybackGetVolume()</code><br>
	 * <i>native declaration : line 175</i>
	 */
	int SpPlaybackGetVolume();
	/**
	 * Original signature : <code>bool SpPlaybackIsPlaying()</code><br>
	 * <i>native declaration : line 176</i>
	 */
	byte SpPlaybackIsPlaying();
	/**
	 * Original signature : <code>bool SpPlaybackIsShuffled()</code><br>
	 * <i>native declaration : line 177</i>
	 */
	byte SpPlaybackIsShuffled();
	/**
	 * Original signature : <code>bool SpPlaybackIsRepeated()</code><br>
	 * <i>native declaration : line 178</i>
	 */
	byte SpPlaybackIsRepeated();
	/**
	 * Original signature : <code>bool SpPlaybackIsActiveDevice()</code><br>
	 * <i>native declaration : line 179</i>
	 */
	byte SpPlaybackIsActiveDevice();
	/**
	 * Original signature : <code>SpError SpConnectionLoginBlob(const char*, const char*)</code><br>
	 * <i>native declaration : line 181</i><br>
	 * @deprecated use the safer methods {@link #SpConnectionLoginBlob(java.lang.String, java.lang.String)} and {@link #SpConnectionLoginBlob(com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SpConnectionLoginBlob(Pointer username, Pointer blob);
	/**
	 * Original signature : <code>SpError SpConnectionLoginBlob(const char*, const char*)</code><br>
	 * <i>native declaration : line 181</i>
	 */
	int SpConnectionLoginBlob(String username, String blob);
	/**
	 * Original signature : <code>SpError SpConnectionLoginPassword(const char*, const char*)</code><br>
	 * <i>native declaration : line 182</i><br>
	 * @deprecated use the safer methods {@link #SpConnectionLoginPassword(java.lang.String, java.lang.String)} and {@link #SpConnectionLoginPassword(com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SpConnectionLoginPassword(Pointer login, Pointer password);
	/**
	 * Original signature : <code>SpError SpConnectionLoginPassword(const char*, const char*)</code><br>
	 * <i>native declaration : line 182</i>
	 */
	int SpConnectionLoginPassword(String login, String password);
	/**
	 * Original signature : <code>SpError SpConnectionLoginZeroConf(const char*, const char*, const char*)</code><br>
	 * <i>native declaration : line 183</i><br>
	 * @deprecated use the safer methods {@link #SpConnectionLoginZeroConf(java.lang.String, java.lang.String, java.lang.String)} and {@link #SpConnectionLoginZeroConf(com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SpConnectionLoginZeroConf(Pointer username, Pointer blob, Pointer clientKey);
	/**
	 * Original signature : <code>SpError SpConnectionLoginZeroConf(const char*, const char*, const char*)</code><br>
	 * <i>native declaration : line 183</i>
	 */
	int SpConnectionLoginZeroConf(String username, String blob, String clientKey);
	/**
	 * Original signature : <code>SpError SpConnectionLoginOauthToken(const char*)</code><br>
	 * <i>native declaration : line 185</i><br>
	 * @deprecated use the safer methods {@link #SpConnectionLoginOauthToken(java.lang.String)} and {@link #SpConnectionLoginOauthToken(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SpConnectionLoginOauthToken(Pointer token);
	/**
	 * Original signature : <code>SpError SpConnectionLoginOauthToken(const char*)</code><br>
	 * <i>native declaration : line 185</i>
	 */
	int SpConnectionLoginOauthToken(String token);
	/**
	 * Original signature : <code>bool SpConnectionIsLoggedIn()</code><br>
	 * <i>native declaration : line 187</i>
	 */
	byte SpConnectionIsLoggedIn();
	/**
	 * Original signature : <code>SpError SpConnectionLogout()</code><br>
	 * <i>native declaration : line 188</i>
	 */
	int SpConnectionLogout();
	/**
	 * Original signature : <code>SpError SpRegisterConnectionCallbacks(const SpConnectionCallbacks*, void*)</code><br>
	 * <i>native declaration : line 190</i>
	 */
	int SpRegisterConnectionCallbacks(SpConnectionCallbacks callbacks, Pointer userdata);
	/**
	 * Original signature : <code>SpError SpRegisterPlaybackCallbacks(const SpPlaybackCallbacks*, void*)</code><br>
	 * <i>native declaration : line 192</i>
	 */
	int SpRegisterPlaybackCallbacks(SpPlaybackCallbacks callbacks, Pointer userdata);
	/**
	 * Original signature : <code>SpError SpRegisterDebugCallbacks(const SpDebugCallbacks*, void*)</code><br>
	 * <i>native declaration : line 194</i>
	 */
	int SpRegisterDebugCallbacks(SpDebugCallbacks callbacks, Pointer userdata);
}
