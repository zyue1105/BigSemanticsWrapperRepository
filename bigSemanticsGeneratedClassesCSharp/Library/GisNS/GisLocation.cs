//
// GisLocation.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.GisNS 
{
	[SimplInherit]
	public class GisLocation : Document
	{
		[SimplScalar]
		private MetadataDouble latitude;

		[SimplScalar]
		private MetadataDouble longitude;

		[SimplScalar]
		private MetadataDouble altitude;

		[SimplScalar]
		private MetadataDouble direction;

		[SimplScalar]
		private MetadataString satellites;

		public GisLocation()
		{ }

		public GisLocation(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataDouble Latitude
		{
			get{return latitude;}
			set
			{
				if (this.latitude != value)
				{
					this.latitude = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDouble Longitude
		{
			get{return longitude;}
			set
			{
				if (this.longitude != value)
				{
					this.longitude = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDouble Altitude
		{
			get{return altitude;}
			set
			{
				if (this.altitude != value)
				{
					this.altitude = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDouble Direction
		{
			get{return direction;}
			set
			{
				if (this.direction != value)
				{
					this.direction = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Satellites
		{
			get{return satellites;}
			set
			{
				if (this.satellites != value)
				{
					this.satellites = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
