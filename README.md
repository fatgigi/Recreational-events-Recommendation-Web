# Recreational-events-Recommendation-Web

This project is a personalization based recommendation engine for recreational events.  

What the project basically does is to use the user's geolocations to search and recommend recreational activities for people to participate.

The backend includes a Java service which has 5 servlets, including the functionalities of search, recommendation, set and unset favorite events and login and logout.

Applied the polymophism and factory pattern to build the DB connection interface, such that either MySQL or MongoDB connection can be built on the fly.

The data comes from the [TicketMaster API](https://developer.ticketmaster.com/).


### App Walkthrough GIF
<img src="http://g.recordit.co/o8pMni5EJo.gif" width=250><br>
---

## Part 1_Logic Tier

### Logic Tier

#### TASKS 
- [ ] User sees an app icon on the home screen and a styled launch screen.
- [ ] User can view and scroll through a list of movies now playing in theaters.
- [ ] User can view the movie poster image for each movie.

#### FINISHED
Five servlets:
- [✓] Search Item : Fetch data from TicketMaster API  
- [✓] Recommendation : Using 


### Notes
Describe any challenges encountered while building the app.

---

## Part 2_Data Tier_A

### MySql

#### TASKS 
- [ ] User sees an app icon on the home screen and a styled launch screen.
- [ ] User can view and scroll through a list of movies now playing in theaters.
- [ ] User can view the movie poster image for each movie.

#### FINISHED
The MySQL database has 4 tables.   
- [✓] The first table is the item with 7 properties, including the item's id, name, rating, address, image_url, url and distance from the user's geolocations.   
- [✓] The second table is the categories, this table has a foreign key linked to the item, as categories is also a property for the item.  
- [✓] The third table is the favorited items, the properties including the user_id, item_id and the time to set this item as the favorite. This table includes the items liked by the users, and can be used as the base data to do the content-recommendations.   
- [✓] The fourth table is the users, which includes the user_id, the password, the first_name and the last_name.

### Notes
Describe any challenges encountered while building the app.

---

## Part 3_Data Tier_B

### MongoDB

#### TASKS 
- [ ] User sees an app icon on the home screen and a styled launch screen.
- [ ] User can view and scroll through a list of movies now playing in theaters.
- [ ] User can view the movie poster image for each movie.

#### FINISHED

### Notes
Describe any challenges encountered while building the app.
