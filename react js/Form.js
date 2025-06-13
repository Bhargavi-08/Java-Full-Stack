 function Form() {
    return(
        <form>
            <div>
            <h1 align="center">Registration Form</h1>
             <label for="">first name:</label>
            <input type="text"/>
            <label >last name:</label>
            <input type="text"/><br/><br/>
            <label for="">email id:</label>
            <input type="email" name="" id="" autofocus/><br/><br/>
            <label for="">password:</label>
            <input type="password" name="" id=""placeholder="password"/><br/><br/>
            <label for="">mobile number:</label>
            <input type="tel" name="" id=""/><br/><br/>
            <label for="">address</label><br/>
            <textarea cols="50" rows="5" value="address"></textarea><br/>
            <label for="">gender</label>
            <input type="radio" name="h" id="1"/>
            <label for="">male</label>
            <input type="radio" name="h" id="1" />
            <label for="">female</label>
            <input type="radio" name="h" id="1" />
            <label for="">others </label><br/>
            <label for="">date of birth:</label>
            <input type="datetime-local" name="" id="" />
            <h2>personnel information</h2><br/>
            <label for="">ssc marks</label>
            <input type="text" name=""id=""/><br/><br/>
            <label for="">Inter/Diploma</label>
            <input type="text" name=""id=""/><br/> <br/>
            <label for="">BTech/Degree</label>
            <input type="text" name=""id=""/><br/><br/>
            <input type="file"/><br/><br/>
            <input type="reset"/><br/><br/>
            <input type="submit"/><br/><br/>
            </div>
            </form>
        
    );
    
}
export default Form;