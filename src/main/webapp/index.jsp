<!DOCTYPE html>
<html lang="en">

<head>

    <title>Game By Mood</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="icon" type="image/x-icon" href="assets/images/icon/favicon.ico"/>
    <link rel="stylesheet" href="assets/stylesheets/gamebymood.css"/>

</head>

<body>

<div id="background-image"></div>

<section class="primary-content">

    <div class="primary-content-container">

        <div class="title-container">
            <h1>How do you feel?</h1>
        </div>

        <div class="mood-selection-container">
            <form method="POST" class="mood-selection-form" target="_blank">
                <div class="radio-button">
                    <input type="radio" name="mood" value="adventurous" id="adventure"/>
                    <label for="adventure">Adventurous</label>
                </div>

                <div class="radio-button">
                    <input type="radio" name="mood" value="competitive" id="competition"/>
                    <label for="competition">Competitive</label>
                </div>

                <div class="radio-button">
                    <input type="radio" name="mood" value="lonely" id="loneliness"/>
                    <label for="loneliness">Lonely</label>
                </div>

                <div class="radio-button">
                    <input type="radio" name="mood" value="patient" id="patience"/>
                    <label for="patience">Patient</label>
                </div>

                <div class="radio-button">
                    <input type="radio" name="mood" value="thoughtful" id="thoughtfulness"/>
                    <label for="thoughtfulness">Thoughtful</label>
                </div>

                <div class="radio-button">
                    <input type="radio" name="mood" value="wise" id="wisdom"/>
                    <label for="wisdom">Wise</label>
                </div>

                <div class="submit-button">
                    <input type="submit" value="Patch me through"/>
                </div>
            </form>
        </div>

    </div>

</section>

</body>

</html>