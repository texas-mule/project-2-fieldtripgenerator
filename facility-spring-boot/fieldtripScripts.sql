-- Table: public.admissions

-- DROP TABLE public.admissions;

CREATE TABLE public.admissions
(
    id integer NOT NULL,
    baby_age text COLLATE pg_catalog."default" DEFAULT 'age 0 - 3'::text,
    child_age text COLLATE pg_catalog."default" DEFAULT 'age 4 - 17'::text,
    adult_age text COLLATE pg_catalog."default" DEFAULT '18 and Up'::text,
    senior_age text COLLATE pg_catalog."default" DEFAULT '65+'::text,
    baby_price money DEFAULT 0.00,
    child_price money DEFAULT 5.00,
    adult_price money DEFAULT 10.00,
    senior_price money DEFAULT 8.00,
    vet_price money DEFAULT 8.00,
    details text COLLATE pg_catalog."default" DEFAULT 'See Website'::text,
    CONSTRAINT admissions_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.admissions
    OWNER to postgres;




INSERT INTO public.admissions(
	id, child_price, adult_price, senior_price, vet_price)
	VALUES (1, 4.00, 5.00, 4.00, 3.00);
INSERT INTO public.admissions(id, details)
	VALUES (2,'School Groups: Special pricing, see website; Book at least 1 week in advance');
INSERT INTO public.admissions(
	id, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (3, 'age 2 and under', 'age 3-11', 'age 12-64', 'age 65 and up', 0.00, 5.75, 8.75, 5.00, 5.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (4, 'See Website','age 2 and under', 'age 3-12', 'age 13+', 'age 65+', 0.00, 8.00, 10.50, 7.00, 7.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (5, 'See Website','age 2 and under', 'age 3-12', 'age 13+', 'age 60+', 0.00, 12.00, 14.00, 12.00, 12.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (6, 'See Website','age 6 and under', 'age 6-17', 'age 18+', 'age 65+', 0.00, 5.00, 8.00, 6.00, 0.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (7, 'See Website','age 2 and under', 'age 3-12', 'age 13+', 'age 65+', 0.00, 4.00, 8.00, 4.00, 4.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (8, 'See Website','age 3 and under', 'age 4-12', 'age 13+', 'age 65+', 0.00, 4.00, 7.00, 5.00, 5.00);
INSERT INTO public.admissions(
	id, details,  baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (9, 'See Website',0.00, 0.00, 0.00, 0.00, 0.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (10, 'See Website','age under 2', 'age 2-17', 'age 18+', 'age 65+', 0.00, 3.50, 5.50, 4.00, 4.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (11, 'Special Tour Prices available: see website','age under 2', 'age 2-12', 'age 13+', 'age 65+', 0.00, 6.00, 8.00, 6.00, 6.00);

INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (13, 'Train Ticket (ages 2 and up) $2.50','age 2 and under', 'age 3-12', 'age 13+', 'age 65+', 0.00, 4.00, 7.00, 5.00, 5.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (14, 'See Website','age 2 and under', 'age 3-12', 'age 13+', 'age 61+', 0.00, 1.00, 2.00, 1.00, 1.00);	
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price)
	VALUES (15, 'Other options and discounts available: see website','age 3 and under', 'age 4-12', 'age 13+', 'age 65+', 0.00, 8.95, 16.95);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (16, 'School Groups: Special Pricing, See Website','age 2 and under', 'age 3-12', 'age 13+', 'age 65+', 0.00, 67.99, 82.99, 67.99, 67.99);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (17, 'See Website','age 2 and under', 'age 3-12', 'age 13+', 'age 65+', 0.00, 12.00, 59.99, 59.99, 59.99);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (18, '1 Free teacher per 10 students; General Admission: child = 11, adult = 17, special needs guests = free; See Website for more','age 2 and under', 'age 3-17', 'age 18+', 'age 62+', 0.00, 9.00, 9.00, 11.00, 11.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (19, '1-hour pass: $12; 2-hour pass: $22; All-Day Pass: $30; Toddler Tumble: $8','age under 6 months', 'age 6 months - 6 years', 'age 6+', 'age 65+', 0.00, 8.00, 30.00, 30.00, 30.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (20, 'See Website','age 1 and under', 'age 1-12', 'age 13+', 'age 65+', 0.00, 8.00, 8.50, 8.00, 8.00);
INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (21, 'See Website','age under 3', 'age 3-17', 'age 18+', 'age 65+', 2.00, 2.00, 2.00, 2.00, 2.00);

INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (12, 'See Website','age under 6', 'age 6-16', 'age 17+', 'age 65+', 0.00, 1.00, 5.00, 5.00, 0.00);

INSERT INTO public.admissions(
	id, details, baby_age, child_age, adult_age, senior_age, baby_price, child_price, adult_price, senior_price, vet_price)
	VALUES (22, 'See Website','age under 3', 'age 3-12', 'age 13+', 'age 60+', 0.00, 8.95, 15.95, 12.95, 12.95);





-- Table: public.information

-- DROP TABLE public.information;

CREATE TABLE public.information
(
    id integer NOT NULL,
    hours text COLLATE pg_catalog."default",
    telephone_num bigint,
    website text COLLATE pg_catalog."default",
    admission integer,
    CONSTRAINT information_pkey PRIMARY KEY (id),
    CONSTRAINT information_admission_fkey FOREIGN KEY (admission)
        REFERENCES public.admissions (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.information
    OWNER to postgres;


INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (1, 'Schedule varies with the seasons. See website for all the details.', 1, 8172721183, 'http://www.uta.edu/planetarium/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (2, 'See Website', 2, 2145156500, 'http://www.dallasarboretum.org/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (3, '9:00 a.m. to 5:00 p.m. daily;*Closed Christmas day', 3, 2146705656, 'http://www.dallas-zoo.org/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (4, 'April 1 - October 22: 10 a.m. to 5 p.m. Weekdays; 10 a.m. to 6 p.m. Weekends', 4, 8177597500, 'http://www.fortworthzoo.com/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (5, 'Check the website for various events and times.', 5, 8172559300, 'http://www.fortworthmuseum.org');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (6, 'Aquarium / Rainforest / Gift Shop Open 7 Days A Week, 10am - 5pm (Closed Thanksgiving & Christmas); Cafe Maya Restaurant 11:30am - 2:30pm; "Eighteen-O-One" Restaurant 11:30am - 2:30pm; Jungle Cafe 11am - 4pm', 22, 2147202224, 'http://www.dwazoo.com');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (7, 'Monday-Saturday: 10am to 5pm; Sunday: 1pm to 5pm; Always check website for changes/exceptions.', 6, 2143503600, 'http://www.flightmuseum.com');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (8, 'Wed: 9AM-4PM; Sat: 9AM-5PM; Sun: 11AM-5PM', 12, 8557338627, 'http://fortworthaviationmuseum.com/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (9, 'Mon-Fri: 10 am - 5 pm; Sat-Sun: 10 am - 5 pm; Final admission is sold at 4:45 pm.; Closed New Year''s Day, Thanksgiving Day, and Christmas Eve and Day.', 7, 2144287476, 'http://texasdiscoverygardens.org/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (10, 'February-July, September-December:Tuesday - Saturday: 10 AM to 4 PM; Sunday: Noon to 4 PM; Monday: Closed to the public; Closed August and January, as well as Thanksgiving Day, Christmas Eve, Christmas Day, New Year''s Eve and New Year''s Day.', 8, 2144285448, 'http://www.dallasheritagevillage.org/');

INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (11, 'Monday - Saturday: 9 am - 5 pm; Sunday: 12 noon - 5 pm', 9, 5123278180, 'http://www.austintexas.gov/department/austin-nature-and-science-center');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (12, 'Tuesday - Saturday 10 am to 5 pm; Wednesday Nights - 5pm to 8pm; Sunday - Noon to 5pm', 10, 5124722499, 'http://www.austinkids.org');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (13, 'Sunday: 1:00 a, to 5:00 pm all year round; There is no June through Aug. program', 11, 5128371215, 'www.pioneerfarms.org');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (14, '10:00am – 6:00pm daily; No admittance after 5:00pm', 13, 5122881490, 'http://www.austinzoo.org/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (15, 'Sun - Wed: 9 - 6; Thur: 9 - 8; Fri - Sat: 9 - 6', 14, 5124778672, 'http://zilkergarden.org');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (16, 'Monday - Friday: 9:00 am - 5:00 pm; Saturday: 10:00 am - 5:00 pm; Sunday: 1:00 pm - 5:00 pm', 9, 5124711604, 'http://www.utexas.edu/depts/tmm');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (17, 'Summer Hours: 9:00 AM - 6:00 PM; Off-season Hours: Varies according to reserved groups, please check website or call.', 15, 5129312283, 'http://myinnerspacecavern.com');

INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (18, 'Monday-Thursday: 10:30am-6pm; Friday-Sunday: 10:30am-10pm', 16, 8176408900, 'https://www.sixflags.com/overtexas');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (19, 'Monday-Thursday: 10am-5pm; Friday: 10am-6pm; Saturday: 10am-8pm; Sunday: 10am-6pm', 17, 2105204732, 'https://seaworld.com/san-antonio/?gclid=EAIaIQobChMIttCB1dK04gIVk7jACh0rEgenEAAYASAAEgKNYPD_BwE');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (20, 'Monday-Thursday: 10:30am-6pm; Friday-Sunday: 10:30am-10pm', 16, 2106975050, 'https://www.sixflags.com/fiestatexas');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (21, 'Varies: see Website', 18, 2104955888, 'https://www.morganswonderland.com/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (22, 'Monday/Tuesday/Thursday: 4-8pm; Wednesday: 10am-12pm, 4-8pm; Friday: 10am-12pm, 4-11pm; Saturday: 10-11am, Sunday: 12-8pm', 19, 8172462710, 'http://www.flightdecktrampolinepark.com/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (23, 'Monday: 2-9pm, Tuesday/Thursday/Friday/Saturday: 12-7pm, Wednesday: closed, Sunday: 1-6pm; Special Holiday Hours: see website', 20, 8172757542, 'https://naturallyfun.org/pools/randol-mill');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (24, 'Monday-Friday: 10am-6pm, Saturday/Sunday: 1-6pm', 21, 9722374167, 'https://grandfungp.com/aquatics/splash-factory/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (25, 'Monday-Thusday: 10am-5pm | Friday-Sunday: 10am-8pm; last ticket sold 1 hours prior to closing', 2, 9722632391, 'https://www.ripleys.com/grandprairie/');
INSERT INTO public."information"(
	id, hours, admission, telephone_num, website)
	VALUES (26, 'See Website', 2, 8178928687, 'https://attstadium.com/tours/educational-tour/');



-- Table: public."facilities"

-- DROP TABLE public."facilities";

CREATE TABLE public."facilities"
(
    id integer NOT NULL,
    facility_name text COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default",
    address text COLLATE pg_catalog."default",
    visit_id integer,
    city text COLLATE pg_catalog."default",
    state text COLLATE pg_catalog."default",
    zip integer,
    CONSTRAINT "facilities_pkey" PRIMARY KEY (id),
    CONSTRAINT "facilities_visit_id_fkey" FOREIGN KEY (visit_id)
        REFERENCES public."information" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."facilities"
    OWNER to postgres;




INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (1, 'Planetarium at UT Arlington', 'The Planetarium full-dome star shows are fantastic, fabulous and fun! With spectacular 3-D digital animations and a super starry sky, you’ll discover an amazing array of astronomical gems. And the music shows are a collection of themed songs set to dazzling lights and animations. What a set of sights and sounds for your senses to enjoy!', '700 Planetarium Place', 'Arlington', 'TX', 76019, 1);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (2, 'Dallas Arboretum', '	The Dallas Arboretum and Botanical Gardens was created to preserve history and nature. Though the gardens are comparatively young, they are leading the field in pursuit of their mission, which has four parts. They are a world-class display garden, committed to building a maintaining a public venue that: Promotes the art, enjoyment and knowledge of horticulture; Provides opportunities for education and research, to give back to the field; Maintains and develops the Arboretum as an essential resource in Dallas; and Prioritizes good management and fiscal responsibility.', '8525 Garland Road', 'Dallas', 'TX', 75218, 2);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (3, 'Dallas Zoo', 'With 95 acres to explore, thousands of animals to visit, and a huge variety of family activities, the Dallas Zoo is enormously entertaining! This 114-year-old refuge is home to exotic and traditional zoo animals. The tallest statue in Texas marks the entrance, a 67.5 foot giraffe that greets visitors. The Wilds of Africa attraction includes the chimpanzee forest, the gorilla center and an aviary on a quarter-mile nature trail where you will explore several habitats including forest, mountain, woodland, river, desert and brush. Be sure to take the 20-minute monorail ride, which runs the course of the attraction and costs an additional fee but is well worth it. At ZooNorth experience many animals in their environments, including a bird and reptile building, children''s zoo with touchable animals, cheetah exhibit and birds of prey, as well as elephants, giraffes, flamingos and other traditional animals.', '650 South R.L. Thorton Fwy', 'Dallas', 'TX', 75203, 3);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (4, 'Fort Worth Zoo', 'Go wild at the Fort Worth Zoo! Named one of the top five zoos in America by Family Life magazine. Discover more than 5,000 native, exotic and endangered animals, all in a beautifully landscaped environment. Get close --really close -- to the animals in many exhibits such as Arachnitopia, World of Primates, the African Savannah, the Meerkat Mounds, the Parrot Paradise, the Herpatarium and much, much more!', '1989 Colonial Parkway', 'Fort Worth', 'TX', 76110, 4);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (5, 'Fort Worth Museum of Science and History', 'Enjoy the pursuit of an exceptional learning experience in science and history at the Fort Worth Museum of Science and History, home to more than 175,000 historical and scientific objects with an emphasis on Texas and the Southwest. There is so much to see and do here including the Planetarium, Exhibits, Discovery Labs and the Omni theater. The science collection consists of many thousands of catalogued specimens that represent the disciplines of botany, entomology, malacology, ornithology, mineralogy, herpetology, mammalogy, invertebrate zoology, meteoritic and paleontology. The herbarium collection of native plants from Texas and the United States dates from the late 1800s to the present.', '1501 Montgomery Street', 'Fort Worth', 'TX', 76107, 5);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (6, 'Dallas World Aquarium', 'Marvel as you begin at the canopy level of a South American rainforest filled with rare and indigenous plants and animals of the Orinoco River basin. The bamboo-planked path leads past monkeys, Giant river otters, many species of toucans and Orinoco crocodiles. Then get an underwater glimpse of Antillean manatees, huge turtles and schooling cichlids. Journey though the aquarium which contains 85,000 gallons of saltwater, including a 22,000 gallon walk-through tunnel. Wrasses, stingrays and rare Leafy seadragons are only a few of the intriguing marine life. Be entertained by black-footed penguins in an outdoor lagoon, while Fairy penguins can be seen swimming in their pool on the second level of the latest expansion - Mundo Maya. Enrich your understanding of the flora and fauna important to the Maya culture, including venomous snakes, Bull and Brown sharks, Jaguars, sea turtles, hummingbirds, owls and eagles. An adventure you won''t want to miss!', '1801 N.Griffin Street', 'Dallas', 'TX', 75202, 6);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (7, 'Frontiers of Flight Museum', 'A wonderful learning experience that exhibits all things related to flying! From the Wright Brothers to space exploration, this museum has a great display of all types of air transportation and equipment. There is an area specifically for younger kids and for older children there is the opportunity to touch, feel and sometimes climb into real aircraft. The docents at this museum make the experience memorable by interacting with children, sharing their knowledge and asking thought provoking questions.', '6911 Lemmon Ave', 'Dallas', 'TX', 75209, 7);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (8, 'Fort Worth Aviation Museum', 'Fort Worth Aviation Museum celebrates and showcases the people and aviation accomplishments of North Texas in a museum and science center that can preserve and display our heritage, educate our community, and inspire our young people to stay in school and achieve their full potential.', '3300 Ross Ave', 'Fort Worth', 'TX', 76106, 8);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (9, 'Texas Discovery Gardens', 'Located in Dallas'' historic Fair Park, Texas Discovery Gardens is a year-round organically maintained urban oasis filled with natural wonders. Family festivals, free admission days, and our extensive (and growing) EarthKeepers student education program introduce children and adults to natural outdoor learning experiences.', '3601 Martin Luther King Jr. Blvd.', 'Dallas', 'TX', 75210, 9);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (10, 'Dallas Heritage Village', 'With a living history museum the visitor talks with a costumed character of the past who is speaking in the vernacular of the day. Often the visitor interacts not only with the interpreter but also his surroundings. For example, a visitor to the 1861 Farmstead at Dallas Heritage Village will be greeted by Mrs. Kennedy, and can sit in her parlor, play checkers, help her with chores and talk with her about the Civil War, her gardens, animals, etc. Living history tends to be multi-sensory, providing sights, sounds, smells and textures. Costumed characters and volunteers are available in selected buildings during Living History Season. Living History season is October 1-December 30 and March 1-June 30. A self-guided walking tour, family guides and cell phone tour is available year round. Visitors may take a self-paced tour of the 13 acre grounds and the beautifully restored 38 historic structures. At 1:30, specially-guided tours of the 2 premier areas - The Millermore complex and Sullivan, are offered. For homeschooling families, there is an annual event, Lone Star History Day, usually held on the second Friday in October. There are also several workshops that can be scheduled for a time that works best for your group.', '1515 South Harwood Street', 'Dallas', 'TX', 75215, 10);	
	
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (11, 'Austin Nature & Science Center', 'Hike up a tree-lined path to this "living nature museum." Located in Zilker Park, discover Austin''s natural world through scientific exploration. Journey down the Eco-Detective Trail (with the help of our Eco-Detective Kit). Adventure into Small Wonders, home of our tiniest residents. Visit over 50 native mammals and birds in our Wildlife Exhibits. The Center also features the Dino Pit exhibit, an outdoor, hands-on exhibit utilizing six different areas for discovery and exploration.', '301 Nature Center Drive', 'Austin', 'TX', 78746, 11);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (12, 'Austin Childrens Museum', 'Create. Discover. Explore. Invent. Learn. Play! Inspire young children and the adults in their lives to experience the joy of constructive play. The Museum targets children 0-9 years of age and is filled with opportunities for informal learning and just plain fun, and it is Austin''s only museum just for the younger set. Come and play in the Rising Star Ranch toddler spot, and the feature exhibit gallery. The Museum also features early childhood programs, cultural events and workshops, camps, educational resources, birthday parties group tour rates, volunteer opportunities, and much more!', '201 Colorado Street', 'Austin', 'TX', 78701, 12);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (13, 'Pioneer Farms', 'Visit an outdoor living history museum - Pioneer Farms - presenting the story of rural life in central Texas during the 1880s. Using historically correct farm animals, crops, clothing, furnishings, buildings, implements and food, costumed interpreters offer a composite look at the family farm and three family lifestyles typical of Walnut Creek in Central Texas. Many classes available such as Blacksmithing, Fiber Arts, Home and Hearth, Farm and Field and more. Several tours available as well.', '10621 Pioneer Farms Drive', 'Austin', 'TX', 78754, 13);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (14, 'Austin Zoo', '	Austin Zoo is a rescue zoo and provides sanctuary to displaced animals from a variety of unfortunate and often neglectful situations. Assisting animals in need through rescue, rehabilitation and education. Visit and help them to continue to do the rescue work and provide quality care for the animals.', '10807 Rawhide Trail', 'Austin', 'TX', 78736, 14);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (15, 'Zilker Botanical Gardens', 'The Austin Area Garden Center is a non-profit organization established in 1955 to support Zilker Botanical Garden''s mission to promote the education and love of gardening among people of all ages. Its projects support beautification of the gardens visited yearly by half a million people from around the world. Its education programs reach thousands of school children and adults every year.', '2220 Barton Springs Rd', 'Austin', 'TX', 78746, 15);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (16, 'Texas Memorial Museum', 'Encouraging awareness and understanding of the past, present and future of biological diversity on earth, especially that of the state of Texas.', '2400 Trinity St - The University of Texas', 'Austin', 'TX', 78705, 16);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (17, 'Inner Space Cavern', 'Hidden for 10,000 years, Inner Space Cavern is one of the best preserved caves in Texas and one of the few places where remains of prehistoric animals were unearthed. Take a ride underground with an informative guide to see and learn about underground caves and the formations inside of them.', '4200 S. IH-35', 'Austin', 'TX', 78626, 17);	
	
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (18, 'Six Flags Over Texas', 'A visit to Six Flags is a fun and engaging way to reinforce lessons learned in the classroom as well as reward students for a job well done. Add a whole new meaning to "the thrill of learning" by connecting your curriculum to Six Flags. Amplify key themes and concepts from your classroom in a safe, stimulating environment. Open-ended discussions about physics, math, and fun promote critical and creative thinking among all ages and invite opportunities for students to consider multiple perspectives. Teachers regularly use Six Flags to help teach their students:Physics (magnetism, gravity, friction, potential energy, etc), Engineering, Geometry, Calculus, Statistics, Cartography, Art & Design, Business skills; Whether you''re interested in one of our special subject-focused learning events or as a separate group on the day of your choice, Six Flags has packages and programs to meet your needs. Please see the Educational Events listed at the bottom of the page for Event details, including special pricing and ordering instructions.', '2201 E. Road to Six Flags St.', 'Arlington', 'TX', 76010, 18);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (19, 'SeaWorld San Antonio', 'Numerous programs are designed specifically by SeaWorld for teachers and students. Give your students a unique opportunity to learn about animal-related careers with hands-on experiences and opportunities to speak directly with experts. We also have programs designed for teachers that provide educational adventures to help expand your knowledge.', '10500 Sea World Dr.', 'San Antonio', 'TX', 78251, 19);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (20, 'Six Flags Fiesta Texas', 'A visit to Six Flags is a fun and engaging way to reinforce lessons learned in the classroom as well as reward students for a job well done. Add a whole new meaning to "the thrill of learning" by connecting your curriculum to Six Flags. Amplify key themes and concepts from your classroom in a safe, stimulating environment. Open-ended discussions about physics, math, and fun promote critical and creative thinking among all ages and invite opportunities for students to consider multiple perspectives. Teachers regularly use Six Flags to help teach their students:Physics (magnetism, gravity, friction, potential energy, etc), Engineering, Geometry, Calculus, Statistics, Cartography, Art & Design, Business skills; Whether you''re interested in one of our special subject-focused learning events or as a separate group on the day of your choice, Six Flags has packages and programs to meet your needs. Please see the Educational Events listed at the bottom of the page for Event details, including special pricing and ordering instructions.', '17000 W. IH-10', 'San Antonio', 'TX', 78257, 20);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (21, 'Morgan''s Wonderland', 'Community Based Instruction at Morgan’s Wonderland enables elementary-school students to be actively engaged in learning. Students can enjoy six 20-minute lesson rotations throughout the park, all while embracing the mission of Morgan’s Wonderland – inclusion. Created by Region 20 Education Service Center, each activity and lesson are based on the corresponding TEKS State Educational Requirement. As a result, teachers will not lose teaching days when their classes are engaged in one of our educational programs.', '5223 David Edwards Dr.', 'San Antonio', 'TX', 78233, 21);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (22, 'Flight Deck Trampoline Park', 'Flight Deck Trampoline Park is DFW’s hottest destination for family fun! Come take flight on our massive indoor court of connected trampolines for an unforgettable adventure. Duck and dive on dodgeball courts, slam dunk on our basketball lanes, soar onto our air bag or just coast at the FDTP Academy, our safe zone for our junior flyers.', '1600 Interstate 20 W.', 'Arlington', 'TX', 76017, 22);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (23, 'Randol Mill Family Aquatic Center', 'The Randol Mill Family Aquatic Center offers aquatic recreation for all ages. The facility includes interactive recreation elements such as a shallow water play structure, vortex pools, current channel, water slide and tot and leisure areas. Other amenities include two shade pavilions, shower facilities, deck furniture and concessions.', '1924 Randol Mill Park Rd.', 'Arlington', 'TX', 76012, 23);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (24, 'Splash Factory', 'The Splash Factory features age-specific play areas including a water wall, ground sprays, play structures, a magic touch water gun, spray cannons and power geysers. Six touch buttons allow children to interact with the play features.', '601 E.Grand Prairie Rd.', 'Grand Prairie', 'TX', 75051, 24);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (25, 'Ripley''s Believe It or Not!', 'Experience our unique attractions including Ripley’s Believe It or Not! Odditorium, a state-of-the-art 7D Moving Theater, our mind-bending Mirror Maze, our challenging LaseRace, our sweet Candy Factory, and meet the stars at Louis Tussauds Palace of Wax', '601 E.Palace Pkwy.', 'Grand Prairie', 'TX', 75050, 25);
INSERT INTO public."facilities"(
	id, facility_name, description, address, city, state, zip, visit_id)
	VALUES (26, 'AT&T Stadium', 'Plan your school’s AT&T Stadium Educational Tour today! Let AT&T Stadium do the teaching as students have an educational experience of a lifetime. Offered in VIP and self-guided options, our class tours take your students behind the scenes of AT&T Stadium with an educationally trained tour guide.TEKS Curriculum is available. Call 817.892.TOUR for group discounts (20 or more people) or additional information. All tour locations are subject to change without notice. Group tours must be booked at least 1 week in advance.', '1 AT&T Way', 'Arlington', 'TX', 76011, 26);	


