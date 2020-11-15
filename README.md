# Recreational-events-Recommendation-Web

This project is a personalization based recommendation engine for recreational events  

What the project basically does is to use the user's geolocations to search and recommend recreational activities for people to participate

The backend includes a Java service which has 5 servlets, including the functionalities of search, recommendation, set and unset favorite events and login and logout

The data comes from the [TicketMaster API](https://developer.ticketmaster.com/)


### App Walkthrough GIF
<img src="http://g.recordit.co/dg0tcdKUxx.gif" width=250><br>
---

## Part 1_Logic Tier

### Logic Tier

#### TASKS 
- [ ] As soon as the user login, fetch data from the TicketMaster API based on the user's geolocations
- [ ] User can favorite and unfavorite specific activities
- [ ] Learn user preferences, recommend items that are "similar" to the user preferences

#### FINISHED
Five servlets:
- [✓] Search activities, fetch data from TicketMaster API  
- [✓] Store favorite activities in the databaes
- [✓] Undo the storation of activities, and delete this activity in the database 
- [✓] User login and store user in the database
- [✓] User logout
Recommendation: 
- [✓] Based on user's favorited activities, do a filter on all the new activites, order the activites based on the categories, distances and ratings.


### Notes
Describe any challenges encountered while building the app.

---

## Part 2_Data Tier_A

### MySql

The MySQL database has 4 tables.   
- [✓] The first table is the item with 7 properties, including the item's id, name, rating, address, image_url, url and distance from the user's geolocations.   
- [✓] The second table is the categories, this table has a foreign key linked to the item, as categories is also a property for the item.  
- [✓] The third table is the favorited items, the properties including the user_id, item_id and the time to set this item as the favorite. This table includes the items liked by the users, and can be used as the base data to do the content-recommendations.   
- [✓] The fourth table is the users, which includes the user_id, the password, the first_name and the last_name.

### Notes

Applied the polymophism and factory pattern to build the DB connection interface, such that either MySQL or MongoDB connection can be built on the fly

---

## Part 3_Data Tier_B

### MongoDB

Use two collections to store the data.
- users - Store user information and user's liked activites
- items - Store activites information, including all the categorites, ratings and distances, ect.

### Notes
Describe any challenges encountered while building the app.
