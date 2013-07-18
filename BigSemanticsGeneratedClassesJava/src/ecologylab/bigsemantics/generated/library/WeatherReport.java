package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *The definition of weather report class.
 */ 
@simpl_inherit
public class WeatherReport extends CompoundDocument
{
	/** 
	 *The name of the city.
	 */ 
	@simpl_scalar
	private MetadataString city;

	/** 
	 *The weather condition of the city, like sunny or cloudy.
	 */ 
	@simpl_scalar
	private MetadataString weather;

	/** 
	 *The URL of the picture indicating weather condition.
	 */ 
	@simpl_composite
	@mm_name("weather_image")
	private Image weatherImage;

	/** 
	 *The temperature.
	 */ 
	@simpl_scalar
	private MetadataString temperature;

	/** 
	 *The humidity of the air.
	 */ 
	@simpl_scalar
	private MetadataString humidity;

	/** 
	 *The wind speed.
	 */ 
	@simpl_scalar
	private MetadataString wind;

	/** 
	 *The dew point.
	 */ 
	@simpl_scalar
	private MetadataString dewPoint;

	/** 
	 *chances of rain in percentage
	 */ 
	@simpl_scalar
	private MetadataString chanceOfRain;

	/** 
	 *the size of the rain
	 */ 
	@simpl_scalar
	private MetadataString rainfall;

	/** 
	 *forecast of today's condition
	 */ 
	@simpl_scalar
	private MetadataString forecast;

	public WeatherReport()
	{ super(); }

	public WeatherReport(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	city()
	{
		MetadataString	result = this.city;
		if (result == null)
		{
			result = new MetadataString();
			this.city = result;
		}
		return result;
	}

	public String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(MetadataString city)
	{
		this.city = city;
	}

	public MetadataString	weather()
	{
		MetadataString	result = this.weather;
		if (result == null)
		{
			result = new MetadataString();
			this.weather = result;
		}
		return result;
	}

	public String getWeather()
	{
		return this.weather == null ? null : weather().getValue();
	}

	public MetadataString getWeatherMetadata()
	{
		return weather;
	}

	public void setWeather(String weather)
	{
		if (weather != null)
			this.weather().setValue(weather);
	}

	public void setWeatherMetadata(MetadataString weather)
	{
		this.weather = weather;
	}

	public Image getWeatherImage()
	{
		return weatherImage;
	}

	public void setWeatherImage(Image weatherImage)
	{
		this.weatherImage = weatherImage;
	}

	public MetadataString	temperature()
	{
		MetadataString	result = this.temperature;
		if (result == null)
		{
			result = new MetadataString();
			this.temperature = result;
		}
		return result;
	}

	public String getTemperature()
	{
		return this.temperature == null ? null : temperature().getValue();
	}

	public MetadataString getTemperatureMetadata()
	{
		return temperature;
	}

	public void setTemperature(String temperature)
	{
		if (temperature != null)
			this.temperature().setValue(temperature);
	}

	public void setTemperatureMetadata(MetadataString temperature)
	{
		this.temperature = temperature;
	}

	public MetadataString	humidity()
	{
		MetadataString	result = this.humidity;
		if (result == null)
		{
			result = new MetadataString();
			this.humidity = result;
		}
		return result;
	}

	public String getHumidity()
	{
		return this.humidity == null ? null : humidity().getValue();
	}

	public MetadataString getHumidityMetadata()
	{
		return humidity;
	}

	public void setHumidity(String humidity)
	{
		if (humidity != null)
			this.humidity().setValue(humidity);
	}

	public void setHumidityMetadata(MetadataString humidity)
	{
		this.humidity = humidity;
	}

	public MetadataString	wind()
	{
		MetadataString	result = this.wind;
		if (result == null)
		{
			result = new MetadataString();
			this.wind = result;
		}
		return result;
	}

	public String getWind()
	{
		return this.wind == null ? null : wind().getValue();
	}

	public MetadataString getWindMetadata()
	{
		return wind;
	}

	public void setWind(String wind)
	{
		if (wind != null)
			this.wind().setValue(wind);
	}

	public void setWindMetadata(MetadataString wind)
	{
		this.wind = wind;
	}

	public MetadataString	dewPoint()
	{
		MetadataString	result = this.dewPoint;
		if (result == null)
		{
			result = new MetadataString();
			this.dewPoint = result;
		}
		return result;
	}

	public String getDewPoint()
	{
		return this.dewPoint == null ? null : dewPoint().getValue();
	}

	public MetadataString getDewPointMetadata()
	{
		return dewPoint;
	}

	public void setDewPoint(String dewPoint)
	{
		if (dewPoint != null)
			this.dewPoint().setValue(dewPoint);
	}

	public void setDewPointMetadata(MetadataString dewPoint)
	{
		this.dewPoint = dewPoint;
	}

	public MetadataString	chanceOfRain()
	{
		MetadataString	result = this.chanceOfRain;
		if (result == null)
		{
			result = new MetadataString();
			this.chanceOfRain = result;
		}
		return result;
	}

	public String getChanceOfRain()
	{
		return this.chanceOfRain == null ? null : chanceOfRain().getValue();
	}

	public MetadataString getChanceOfRainMetadata()
	{
		return chanceOfRain;
	}

	public void setChanceOfRain(String chanceOfRain)
	{
		if (chanceOfRain != null)
			this.chanceOfRain().setValue(chanceOfRain);
	}

	public void setChanceOfRainMetadata(MetadataString chanceOfRain)
	{
		this.chanceOfRain = chanceOfRain;
	}

	public MetadataString	rainfall()
	{
		MetadataString	result = this.rainfall;
		if (result == null)
		{
			result = new MetadataString();
			this.rainfall = result;
		}
		return result;
	}

	public String getRainfall()
	{
		return this.rainfall == null ? null : rainfall().getValue();
	}

	public MetadataString getRainfallMetadata()
	{
		return rainfall;
	}

	public void setRainfall(String rainfall)
	{
		if (rainfall != null)
			this.rainfall().setValue(rainfall);
	}

	public void setRainfallMetadata(MetadataString rainfall)
	{
		this.rainfall = rainfall;
	}

	public MetadataString	forecast()
	{
		MetadataString	result = this.forecast;
		if (result == null)
		{
			result = new MetadataString();
			this.forecast = result;
		}
		return result;
	}

	public String getForecast()
	{
		return this.forecast == null ? null : forecast().getValue();
	}

	public MetadataString getForecastMetadata()
	{
		return forecast;
	}

	public void setForecast(String forecast)
	{
		if (forecast != null)
			this.forecast().setValue(forecast);
	}

	public void setForecastMetadata(MetadataString forecast)
	{
		this.forecast = forecast;
	}
}
