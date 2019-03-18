/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.android.admob;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollFunction;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollObject;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;

import android.content.Context;
import android.os.AsyncTask;

import com.google.ads.consent.AdProvider;
import com.google.ads.consent.ConsentForm;
import com.google.ads.consent.ConsentFormListener;
import com.google.ads.consent.ConsentInfoUpdateListener;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import com.google.ads.consent.DebugGeography;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

@Kroll.module(name="Admob", id="ti.android.admob")
public class AdmobModule extends KrollModule
{
	private static final String TAG = "Admob Module";
    public static String MODULE_NAME = "Android Admob Module";
    
    //EVENTS
    @Kroll.constant
    public static final String AD_RECEIVED = "ad_received";
    @Kroll.constant
    public static final String AD_CLOSED = "ad_closed";
    @Kroll.constant
    public static final String AD_NOT_RECEIVED = "ad_not_received";
    @Kroll.constant
    public static final String AD_READY_TO_BE_SHOWN = "ad_ready_to_be_shown";
    @Kroll.constant
    public static final String AD_NOT_READY_YET = "ad_not_ready_yet";
    @Kroll.constant
    public static final String AD_BEING_SHOWN = "ad_being_shown";
    @Kroll.constant
    public static final String AD_DESTROYED = "ad_destroyed";
    @Kroll.constant
    public static final String AD_OPENED = "ad_opened";
    @Kroll.constant
    public static final String AD_VIDEO_STARTED = "ad_video_started";
    @Kroll.constant
    public static final String AD_VIDEO_ENDED = "ad_video_ended";
    @Kroll.constant
    public static final String AD_REWARDED = "ad_rewarded";
    
    //AD SIZES
    @Kroll.constant
    public static final String BANNER = "BANNER";
    @Kroll.constant
    public static final String REWARDED_VIDEO = "REWARDED_VIDEO";
    @Kroll.constant
    public static final String MEDIUM_RECTANGLE = "MEDIUM_RECTANGLE";
    @Kroll.constant
    public static final String FULL_BANNER = "FULL_BANNER";
    @Kroll.constant
    public static final String LEADERBOARD = "LEADERBOARD";
    @Kroll.constant
    public static final String SMART_BANNER = "SMART_BANNER";
    @Kroll.constant
    public static final String INTERSTITIAL = "INTERSTITIAL";
    @Kroll.constant
    public static final String NATIVE_APP_INSTALL = "NATIVE_APP_INSTALL";
    @Kroll.constant
    public static final String UNIFIED_NATIVE_ADS = "UNIFIED_NATIVE_ADS";
    @Kroll.constant
    public static final String NATIVE = "NATIVE";
    @Kroll.constant
    public static final String FLUID = "FLUID";
    @Kroll.constant
    public static final String LARGE_BANNER = "LARGE_BANNER";
    @Kroll.constant
    public static final String SEARCH = "SEARCH";
    @Kroll.constant
    public static final String WIDE_SKYSCRAPER = "WIDE_SKYSCRAPER";
    
    public static String TEST_DEVICE_ID;
    public static Boolean TESTING = false;
    public static String PUBLISHER_ID;
    public static String AD_UNIT_ID;
    public static String PROPERTY_COLOR_BG;
    public static String NATIVE_ADS_BACKGROUND_COLOR;
    public static int AD_HEIGHT = 132;
    public static int AD_WIDTH = 360;
    public static String PROPERTY_COLOR_BG_TOP;
    public static String PROPERTY_COLOR_BORDER;
    public static String PROPERTY_COLOR_TEXT;
    public static String PROPERTY_COLOR_LINK;
    public static String PROPERTY_COLOR_URL;
    public static String PROPERTY_COLOR_TEXT_DEPRECATED;
    public static String PROPERTY_COLOR_LINK_DEPRECATED;
    public static String AD_SIZE_TYPE;
    public static ArrayList<AdSize> AD_SIZES;
    public static String AD_SIZES_LABEL;
    public static String KEYWORD;
    public static String CONTENT_URL;
    
    public static String VIEW_TYPE;
    
    @Kroll.constant
    public static final String TYPE_ADS = "ads";
    
    @Kroll.constant
    public static final String TYPE_STARS = "stars";
    
    @Kroll.constant
    public static final String TYPE_MEDIA = "media";
    
    public static String MASTER_VIEW;
    public static String MEDIA_VIEW;
    public static String HEADLINE_LABEL;
    public static String IMAGE_VIEW;
    public static String BODY_LABEL;
    public static String CALL_TO_ACTION_BUTTON;
    public static String LOGO_OR_ICON_IMAGE_VIEW;
    public static String ADVERTISER_LABEL;
    public static String STORE_LABEL;
    public static String STARS_VIEW;
    public static String PRICE_LABEL;
    public static String EXTRA_BUNDLE;

    public AdmobModule() {
        Log.d(TAG, "Admob Module Instantiated");
    }

    public void setTesting(Boolean testing) {
        Log.d(TAG, "setTesting(): " + testing);
        TESTING = testing;
    }
    
    public void setHeight(int height) {
        Log.d(TAG, "setHeight(): " + height);
        AD_HEIGHT = height;
    }
    
    public void setWidth(int width) {
        Log.d(TAG, "setHeight(): " + width);
        AD_WIDTH = width;
    }

    static {
        PROPERTY_COLOR_BG = "backgroundColor";
        PROPERTY_COLOR_BG_TOP = "backgroundTopColor";
        PROPERTY_COLOR_BORDER = "borderColor";
        PROPERTY_COLOR_TEXT = "textColor";
        PROPERTY_COLOR_LINK = "linkColor";
        PROPERTY_COLOR_URL = "urlColor";
        PROPERTY_COLOR_TEXT_DEPRECATED = "primaryTextColor";
        PROPERTY_COLOR_LINK_DEPRECATED = "secondaryTextColor";
        AD_SIZE_TYPE = "adSizeType";
        AD_SIZES_LABEL = "adSizes";
        
        VIEW_TYPE = "viewType";
        
        MASTER_VIEW = "masterView";
        MEDIA_VIEW = "mediaView";
        HEADLINE_LABEL = "headlineLabel";
        IMAGE_VIEW = "imageView";
        BODY_LABEL = "bodyLabel";
        CALL_TO_ACTION_BUTTON = "callToActionButton";
        LOGO_OR_ICON_IMAGE_VIEW = "logoOrIconImageView";
        ADVERTISER_LABEL = "advertiserLabel";
        STORE_LABEL = "storeLabel";
        STARS_VIEW = "starsView";
        PRICE_LABEL = "priceLabel";
        NATIVE_ADS_BACKGROUND_COLOR = "backgroundColor";
        
        KEYWORD = "keyword";
        CONTENT_URL = "contentUrl";
        
        EXTRA_BUNDLE = "extras";
    }
    
    private final String ANDROID_ADVERTISING_ID = "androidAdId";
	private final String IS_LIMIT_AD_TRACKING_ENABLED = "isLimitAdTrackingEnabled";
	
	private ConsentForm form = null;
    
	// Response from "isGooglePlayServicesAvailable()""
	@Kroll.constant
	public static final int SUCCESS = 0;
	@Kroll.constant
	public static final int SERVICE_MISSING = 1;
	@Kroll.constant
	public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
	@Kroll.constant
	public static final int SERVICE_DISABLED = 3;
	@Kroll.constant
	public static final int SERVICE_INVALID = 9;

	// Response from "consentStatus"
	@Kroll.constant
	public static final int CONSENT_STATUS_UNKNOWN = 0;
	@Kroll.constant
	public static final int CONSENT_STATUS_NON_PERSONALIZED = 1;
	@Kroll.constant
	public static final int CONSENT_STATUS_PERSONALIZED = 2;

	@Kroll.constant
	public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
	@Kroll.constant
	public static final int DEBUG_GEOGRAPHY_EEA = 1;
	@Kroll.constant
	public static final int DEBUG_GEOGRAPHY_NOT_EEA = 3;
	
	// clang-format off
	@Kroll.setProperty
	@Kroll.method
	public void setPublisherId(String pubId)
	// clang-format on
	{
		Log.d(TAG, "setPublisherId(): " + pubId);
		PUBLISHER_ID = pubId;
	}

	@Kroll.method
	public void isLimitAdTrackingEnabled(KrollFunction callback) {
		if (callback != null) {
			new getAndroidAdvertisingIDInfo(callback).execute(IS_LIMIT_AD_TRACKING_ENABLED);
		}
	}

	@Kroll.method
	public void getAndroidAdId(KrollFunction callback) {
		if (callback != null) {
			new getAndroidAdvertisingIDInfo(callback).execute(ANDROID_ADVERTISING_ID);
		}
	}

	private void invokeAIDClientInfoCallback(AdvertisingIdClient.Info aaClientIDInfo, String responseKey, KrollFunction callback) {
		KrollDict callbackDictionary = new KrollDict();
		Object responseValue = null;
		switch (responseKey) {
			case ANDROID_ADVERTISING_ID:
				responseValue = aaClientIDInfo.getId();
				break;
			case IS_LIMIT_AD_TRACKING_ENABLED:
				responseValue = aaClientIDInfo.isLimitAdTrackingEnabled();
				break;
		}
		callbackDictionary.put(responseKey, responseValue);
		callback.callAsync(getKrollObject(), callbackDictionary);
	}

	private class getAndroidAdvertisingIDInfo extends AsyncTask<String, Integer, String> {

		private AdvertisingIdClient.Info aaClientIDInfo = null;
		private KrollFunction aaInfoCallback;

		public getAndroidAdvertisingIDInfo(KrollFunction infoCallback) {
			this.aaInfoCallback = infoCallback;
		}

		@Override
		protected String doInBackground(String... responseKey) {
			try {
				aaClientIDInfo = AdvertisingIdClient.getAdvertisingIdInfo(TiApplication.getInstance().getApplicationContext());
				return responseKey[0];
			} catch (IOException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
				e.printStackTrace();
				return null;
			}
		}

		@Override
		protected void onPostExecute(String responseKey) {
			if (aaClientIDInfo != null) {
				invokeAIDClientInfoCallback(aaClientIDInfo, responseKey, aaInfoCallback);
			}
		}
	}
	
	@Kroll.method
	public void requestConsentInfoUpdateForPublisherIdentifiers(KrollDict args)
	{
		String[] publisherIdentifiers = args.getStringArray("publisherIdentifiers");
		final KrollFunction callback;
		{
			Object value = args.get("callback");
			if (value instanceof KrollFunction) {
				callback = (KrollFunction) value;
			} else {
				throw new RuntimeException("The 'callback' property is required and must be set to a function.");
			}
		}

		Context appContext = TiApplication.getInstance().getApplicationContext();

		ConsentInformation consentInformation = ConsentInformation.getInstance(appContext);
		consentInformation.requestConsentInfoUpdate(publisherIdentifiers, new ConsentInfoUpdateListener() {
			public void onConsentInfoUpdated(ConsentStatus consentStatus)
			{
				Log.d(TAG, "consent info updated");

				KrollObject krollObject = getKrollObject();
				KrollDict event = new KrollDict();

				event.put("consentStatus", consentStatus.ordinal());

				callback.callAsync(krollObject, event);
			}

			public void onFailedToUpdateConsentInfo(String errorReason)
			{
				Log.d(TAG, "consent info failed");

				KrollObject krollObject = getKrollObject();
				KrollDict event = new KrollDict();

				event.put("error", errorReason);

				callback.callAsync(krollObject, event);
			}
		});
	}

	@Kroll.method
	public void showConsentForm(KrollDict args)
	{
		URL privacyUrl = null;
		Context currentActivity = TiApplication.getInstance().getCurrentActivity();

		final KrollFunction callback;
		{
			Object value = args.get("callback");
			if (value instanceof KrollFunction) {
				callback = (KrollFunction) value;
			} else {
				throw new RuntimeException("The 'callback' property is required and must be set to a function.");
			}
		}

		boolean shouldOfferPersonalizedAds = args.optBoolean("shouldOfferPersonalizedAds", true);
		boolean shouldOfferNonPersonalizedAds = args.optBoolean("shouldOfferNonPersonalizedAds", true);
		boolean shouldOfferAdFree = args.optBoolean("shouldOfferAdFree", false);

		try {
			privacyUrl = new URL(args.getString("privacyURL"));
		} catch (Exception e) {
			KrollObject krollObject = getKrollObject();
			KrollDict event = new KrollDict();

			event.put("error", e.getMessage());

			callback.callAsync(krollObject, event);
			return;
		}

		ConsentForm.Builder formBuilder =
			new ConsentForm.Builder(currentActivity, privacyUrl).withListener(new ConsentFormListener() {
				@Override
				public void onConsentFormLoaded()
				{
					Log.d(TAG, "consent form loaded");
					if (form != null) {
						form.show();
					}
				}

				@Override
				public void onConsentFormOpened()
				{
					Log.d(TAG, "consent form opened");
				}

				@Override
				public void onConsentFormClosed(ConsentStatus consentStatus, Boolean userPrefersAdFree)
				{
					Log.d(TAG, "consent form closed");

					KrollObject krollObject = getKrollObject();
					KrollDict event = new KrollDict();

					event.put("userPrefersAdFree", userPrefersAdFree);
					event.put("consentStatus", consentStatus.ordinal());
					event.put("error", null);

					callback.callAsync(krollObject, event);
				}

				@Override
				public void onConsentFormError(String errorDescription)
				{
					Log.d(TAG, "consent form error: " + errorDescription);

					KrollObject krollObject = getKrollObject();
					KrollDict event = new KrollDict();

					event.put("error", errorDescription);

					callback.callAsync(krollObject, event);
				}
			});

		if (shouldOfferPersonalizedAds) {
			formBuilder = formBuilder.withPersonalizedAdsOption();
		}

		if (shouldOfferNonPersonalizedAds) {
			formBuilder = formBuilder.withNonPersonalizedAdsOption();
		}

		if (shouldOfferAdFree) {
			formBuilder = formBuilder.withAdFreeOption();
		}

		form = formBuilder.build();
		runOnMainThread(new Runnable() {
			@Override
			public void run()
			{
				form.load();
			}
		});
	}

	// clang-format off
	@Kroll.setProperty
	@Kroll.method
	public void setTagForUnderAgeOfConsent(boolean underAgeOfConsent)
	// clang-format on
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		ConsentInformation.getInstance(appContext).setTagForUnderAgeOfConsent(underAgeOfConsent);
	}

	@Kroll.method
	public boolean isTaggedForUnderAgeOfConsent()
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		return ConsentInformation.getInstance(appContext).isTaggedForUnderAgeOfConsent();
	}

	// clang-format off
	@Kroll.getProperty
	@Kroll.method
	public int getConsentStatus()
	// clang-format on
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		return ConsentInformation.getInstance(appContext).getConsentStatus().ordinal();
	}

	// clang-format off
	@Kroll.getProperty
	@Kroll.method
	public int getDebugGeography()
	// clang-format on
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		return ConsentInformation.getInstance(appContext).getDebugGeography().ordinal();
	}

	// clang-format off
	@Kroll.setProperty
	@Kroll.method
	public void setDebugGeography(int debugGeography)
	// clang-format on
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		ConsentInformation.getInstance(appContext).setDebugGeography(DebugGeography.values()[debugGeography]);
	}

	@Kroll.method
	public void resetConsent()
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		ConsentInformation.getInstance(appContext).reset();
	}

	// clang-format off
	@Kroll.getProperty
	@Kroll.method
	public KrollDict[] getAdProviders()
	// clang-format on
	{
		Context appContext = TiApplication.getInstance().getApplicationContext();
		List<AdProvider> adProviders = ConsentInformation.getInstance(appContext).getAdProviders();
		KrollDict[] result = new KrollDict[adProviders.size()];

		for (int i = 0; i < adProviders.size(); i++) {
			AdProvider adProvider = adProviders.get(i);
			KrollDict dict = new KrollDict();

			dict.put("identifier", adProvider.getId());
			dict.put("name", adProvider.getName());
			dict.put("privacyPolicyURL", adProvider.getPrivacyPolicyUrlString());

			result[i] = dict;
		}

		return result;
	}
}