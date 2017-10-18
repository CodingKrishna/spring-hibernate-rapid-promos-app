<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
	$(".subscribe-me").subscribeBetter({
	  trigger: "atendpage", 
	  animation: "fade",
	  delay: 0,
	  showOnce: true,
	  autoClose: false,
	  scrollableModal: false
	});


		var loadFile = function(event) {
			var output = document.getElementById('output');
			output.src = URL.createObjectURL(event.target.files[0]);
			//alert(output.value);
		};
		
		
		window.fbAsyncInit = function() {
			FB.init({
				appId : '931370890250419',
				xfbml : true,
				version : 'v2.5'
			});
		};

		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id)) {
				return;
			}
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_US/sdk.js";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));

		FB.ui({
			method : 'share',
			href : 'https://developers.facebook.com/docs/',
		}, function(response) {
			
		});
	
	
	</script>

</head>
<body>
<h3>Fb Like</h3>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=931370890250419";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>
	
	<div class="fb-like"
		data-href="https://www.facebook.com/profile.php?id=100011092546947"
		data-layout="standard" data-action="like" data-show-faces="true"
		data-share="true"></div>

	<h3>Fb Share</h3>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=931370890250419";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<div class="fb-share-button"
		data-href="https://www.facebook.com/profile.php?id=100011092546947"
		data-layout="button_count"></div>

	<h3>Fb Send Message</h3>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=931370890250419";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>
	
	<div class="fb-send" data-href="https://www.facebook.com/profile.php?id=100011092546947"></div>

	<h3>Fb Page plugIn</h3>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=931370890250419";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<div class="fb-page"
		data-href="https://www.facebook.com/RapidPromos-1310823022276692/"
		data-tabs="timeline" data-width="400" data-height="200"
		data-small-header="true" data-adapt-container-width="true"
		data-hide-cover="false" data-show-facepile="true"></div>

	<h3>Fb Follow Button</h3>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=931370890250419";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<div class="fb-follow"
		data-href="https://www.facebook.com/profile.php?id=100011092546947"
		data-width="10" data-layout="standard" data-show-faces="true"></div>

	<h3>Fb Comment</h3>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5&appId=931370890250419";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<div class="fb-comments"
		data-href="https://www.facebook.com/profile.php?id=100011092546947"
		data-numposts="6"></div>
		
		
  <div class="subscribe-me">
    <a href="#close" class="sb-close-btn">x</a>
  
  </div>
 
</body>
</html>