document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.modal');
    var instances = M.Modal.init(elems);
});

document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.autocomplete');
    var instances = M.Autocomplete.init(elems);
});

index = {
    save : function () {
        var hero = {
            name: $('#createName').val(),
            age: $('#createAge').val(),
            note: $('#createNote').val()
        };

        $.ajax({
            url: '/save',
            type: 'post',
            data: JSON.stringify(hero),
            dataType: 'json',
            contentType: 'application/json; charset=utf-8'
        }).done(function () {
            location.reload();
        }).fail(function () {
            alert('Please try again');
        });
    }
};

function save() {
    index.save();
}