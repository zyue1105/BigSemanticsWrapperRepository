//
// ImdbTitle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 11/07/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.imdb;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.imdb 
{
	/// <summary>
	/// IMDB metadata
	/// </summary>
	[SimplInherit]
	public class ImdbTitle : CompoundDocument
	{
		[SimplScalar]
		private MetadataString yearReleased;

		[SimplCollection("person_details")]
		[MmName("directors")]
		private List<PersonDetails> directors;

		[SimplCollection("person_details")]
		[MmName("writers")]
		private List<PersonDetails> writers;

		[SimplCollection("cast_member")]
		[MmName("cast")]
		private List<CastMember> cast;

		[SimplScalar]
		private MetadataString rating;

		[SimplScalar]
		private MetadataString releaseDate;

		[SimplCollection("genre")]
		[MmName("genres")]
		private List<Genre> genres;

		[SimplScalar]
		private MetadataString plot;

		[SimplScalar]
		private MetadataString tagline;

		[SimplCollection("image")]
		[MmName("title_photos")]
		private List<Image> titlePhotos;

		[SimplScalar]
		private MetadataParsedURL posterImg;

		public ImdbTitle()
		{ }

		public ImdbTitle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString YearReleased
		{
			get{return yearReleased;}
			set{yearReleased = value;}
		}

		public List<PersonDetails> Directors
		{
			get{return directors;}
			set{directors = value;}
		}

		public List<PersonDetails> Writers
		{
			get{return writers;}
			set{writers = value;}
		}

		public List<CastMember> Cast
		{
			get{return cast;}
			set{cast = value;}
		}

		public MetadataString Rating
		{
			get{return rating;}
			set{rating = value;}
		}

		public MetadataString ReleaseDate
		{
			get{return releaseDate;}
			set{releaseDate = value;}
		}

		public List<Genre> Genres
		{
			get{return genres;}
			set{genres = value;}
		}

		public MetadataString Plot
		{
			get{return plot;}
			set{plot = value;}
		}

		public MetadataString Tagline
		{
			get{return tagline;}
			set{tagline = value;}
		}

		public List<Image> TitlePhotos
		{
			get{return titlePhotos;}
			set{titlePhotos = value;}
		}

		public MetadataParsedURL PosterImg
		{
			get{return posterImg;}
			set{posterImg = value;}
		}
	}
}
