module zoo.animal.talks{
	requires zoo.animal.feeding;
	requires zoo.animal.care;

	exports zoo.animal.talks.content;
	exports zoo.animal.talks.media;
	exports zoo.animal.talks.schedule;
}